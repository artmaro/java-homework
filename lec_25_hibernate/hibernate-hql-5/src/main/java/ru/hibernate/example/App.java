package ru.hibernate.example;

import org.hibernate.CacheMode;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

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

            stock = new Stock();

            stock.setStockCode("5122");
            stock.setStockName("GTS");

            session.save(stock);

            stock = new Stock();

            stock.setStockCode("6121");
            stock.setStockName("BSAE");

            session.save(stock);
            session.getTransaction().commit();


            session.beginTransaction();

            Query query;

            query = session.createQuery("update Stock set stockName = :stockName" +
                    " where stockCode = :stockCode");
            query.setParameter("stockName", "DIALOG1");
            query.setParameter("stockCode", "5122");
            int result = query.executeUpdate();
            System.out.println("result = " + result);

            query = session.createQuery("from Stock where stockCode = :code ");
            query.setParameter("code", "5122");
            List list = query.list();

            System.out.println("inconsistent result : " + list);

            session.evict(list.get(0)); //надо вытолкнуть элемент из кеша сессии hibernate

            query = session.createQuery("from Stock where stockCode = :code ");
            query.setParameter("code", "5122");
            list = query.list();


            System.out.println("actual result " + list);

            query = session.createQuery("delete Stock where stockCode = '6121'");
            result = query.executeUpdate();


            session.getTransaction().commit();

        } finally {
            HibernateUtil.shutdown();
        }


    }
}
