package ru.hibernate.example;

import org.hibernate.Session;

import java.util.Date;

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

            stock.setStockCode("7052");
            stock.setStockName("PADINI");
           // stock.setStockName("PADINI1111111111111111111111111111111");
            stock.setSum(40);//если меньше 4 то будет ошибка

            StockDetail stockDetail = new StockDetail();
            stockDetail.setCompName("PADINI Holding Malaysia");
            stockDetail.setCompDesc("one stop shopping");
            stockDetail.setRemark("vinci vinci");
            stockDetail.setListedDate(new Date());

            stock.setStockDetail(stockDetail);
            stockDetail.setStock(stock);

            session.save(stockDetail);


            session.getTransaction().commit();

            session.close();
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            stock = null;
            stock = (Stock) session.get(Stock.class, 1);//выполняется 2 запроса, если optional = true
            System.out.println("stock name " + stock.getStockName());


            System.out.println("stock detail " + stock.getStockDetail());

            session.getTransaction().commit();

        } finally {
            HibernateUtil.shutdown();
        }


    }
}
