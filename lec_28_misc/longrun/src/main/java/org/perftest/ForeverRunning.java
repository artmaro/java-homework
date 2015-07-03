package org.perftest;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class ForeverRunning {

    //-XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=duration=60s,filename=myrecording.jfr
    public static void main(String[] args) {
        final List<Person> personList = new ArrayList<>();
        for (int i = 0; i< 1000; i++) {
            personList.add(Person.buildPerson("Jack", 40));
            personList.add(Person.buildPerson("Back", 41));
            personList.add(Person.buildPerson("Sack", 43));
            personList.add(Person.buildPerson("Rack", 45));
            personList.add(Person.buildPerson("Tack", 12));
            personList.add(Person.buildPerson("Eack", 61));
            personList.add(Person.buildPerson("Gack", 12));
            personList.add(Person.buildPerson("Kack", 23));
            personList.add(Person.buildPerson("Zack", 31));
        }


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Object lock = new Object();
                    synchronized (lock) {
                        while (true) {
                            lock.wait();
                            System.out.print(personList);
                        }
                    }
                } catch (InterruptedException ex) {
                }
            }
        }).start();

        System.out.print(personList);
    }
}
