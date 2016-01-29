package cdi.example;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created by ekokuykin on 22.06.15.
 */
public class Main {
    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        CustomerService bookService = container.instance().select(CustomerService.class).get();

        Customer customer = new Customer();
        customer.setId(123L);
        customer.setFirstName("bob");

        bookService.createCustomer(customer);

        customer = new Customer();
        customer.setId(22L);
        customer.setFirstName("jack");

        bookService.createCustomer(customer);

        Customer customerById = bookService.findCustomerById(123L);
        System.out.println(customerById.getFirstName());

        weld.shutdown();
    }
}
