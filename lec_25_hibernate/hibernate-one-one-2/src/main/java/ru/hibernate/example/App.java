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
            stock = (Stock) session.get(Stock.class, 1);//выполняется 2 запроса, несмотря на lazy load из-за особенностей hibernate
            System.out.println("stock name " + stock.getStockName());


            session.getTransaction().commit();

        } finally {
            HibernateUtil.shutdown();
        }


    }
}
