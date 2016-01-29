package cdi.example;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eugene on 29.01.16.
 */
public class Repository {
    List<Customer> list ;

    @PostConstruct
    public void setup(){
        list = new ArrayList<Customer>();
    }

    public void addCustomer(Customer c){
        list.add(c);
    }

    public List<Customer> getList() {
        return list;
    }
}
