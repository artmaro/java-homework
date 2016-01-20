package ru.hibernate.example;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        try {

            Session session = HibernateUtil.getSessionFactory().openSession();

            session.beginTransaction();
            Stock stock = new Stock();

            stock.setStockCode("5123");
            stock.setStockName("KOU");

            session.save(stock);

            int i = 10;
            while (i >0){
                Thread.sleep(200);
                stock.setStockName("Name " + i);
                i--;
            }


            stock = new Stock();

            stock.setStockCode("1241");
            stock.setStockName("RTS");

            session.save(stock);
            session.getTransaction().commit();


            session.beginTransaction();
            stock = (Stock) session.get(Stock.class, 1); //By primary key

            System.out.println("stock " + stock);

            System.out.println("list : " + session.createCriteria(Stock.class).list());

            Stock withSameAddress = (Stock) session.get(Stock.class, 1);

            session.getTransaction().commit();

            session.close();

            if(withSameAddress == stock){
                System.out.println("Same address in memmory " + withSameAddress.toString());
            }


            session = HibernateUtil.getSessionFactory().openSession();

            Stock differentAddress = (Stock) session.get(Stock.class, 1);
            if(differentAddress != stock){
                System.out.println("Same data, but different object in memmory");
            }

        } finally {
            HibernateUtil.shutdown();
        }


    }
}
