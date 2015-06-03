package ru.hibernate.example;

import org.hibernate.Session;

/**
 * Created by ekokuykin on 03.06.15.
 */
public class AppUpdate {

    public static void main(String[] args) {
        try {

            Session session = HibernateUtil.getSessionFactory().openSession();

            session.beginTransaction();
            Stock stock = new Stock();

            stock.setStockCode("4715");
            stock.setStockName("GENM");

            session.save(stock);

            stock.setStockName("NEW NAME");

            session.getTransaction().commit();

            session.close();

            session = HibernateUtil.getSessionFactory().openSession();

            Stock stock1 = (Stock) session.get(Stock.class, 1);

            System.out.println("stock.name " + stock1.getStockName());

        } finally {
            HibernateUtil.shutdown();
        }


    }
}
