package ru.hibernate.example;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {

            Session session = HibernateUtil.getSessionFactory().openSession();

            session.beginTransaction();
            Stock stock = new Stock();

            stock.setStockCode("5123");
            stock.setStockName("KOU");

            session.save(stock);

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
                System.out.println("Same address in memmory");
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
