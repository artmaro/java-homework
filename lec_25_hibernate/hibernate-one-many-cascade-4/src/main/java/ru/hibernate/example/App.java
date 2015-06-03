package ru.hibernate.example;

import org.hibernate.Session;
import org.hibernate.stat.Statistics;

import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            Statistics stats = HibernateUtil.getSessionFactory().getStatistics();
            session.beginTransaction();

            Stock stock = new Stock();
            stock.setStockCode("7052");
            stock.setStockName("PADINI");



            StockDailyRecord stockDailyRecords = new StockDailyRecord();
            stockDailyRecords.setPriceOpen(new Float("1.2"));
            stockDailyRecords.setPriceClose(new Float("1.1"));
            stockDailyRecords.setPriceChange(new Float("10.0"));
            stockDailyRecords.setVolume(3000000L);
            stockDailyRecords.setDate(new Date());

            stockDailyRecords.setStock(stock);
            stock.getStockDailyRecords().add(stockDailyRecords);

            StockDailyRecord stockDailyRecords1 = new StockDailyRecord();
            stockDailyRecords1.setPriceOpen(new Float("2.2"));
            stockDailyRecords1.setPriceClose(new Float("3.1"));
            stockDailyRecords1.setPriceChange(new Float("40.0"));
            stockDailyRecords1.setVolume(3000000L);
            stockDailyRecords1.setDate(new Date());

            stockDailyRecords1.setStock(stock);
            stock.getStockDailyRecords().add(stockDailyRecords1);

            //session.saveOrUpdate(stockDailyRecords); не нужно сохранять отдельно, сохранение произойдет каскадно
            //session.saveOrUpdate(stockDailyRecords1);

            session.saveOrUpdate(stock);

            session.getTransaction().commit();


        } finally {
            HibernateUtil.shutdown();
        }



    }
}
