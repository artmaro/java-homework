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

            stock.setStockCode("4715");
            stock.setStockName("GENM");

            session.save(stock);
            session.getTransaction().commit();
        } finally {
            HibernateUtil.shutdown();
        }


    }
}
