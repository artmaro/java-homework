package cdi.example;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.Interceptors;


/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 7 with Glassfish 4
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */

@Interceptors(ProfileInterceptor.class)
public class CustomerService {

  // ======================================
  // =             Attributes             =
  // ======================================


  // ======================================
  // =          Lifecycle methods         =
  // ======================================

  @Inject
  private Repository repository;

  @PostConstruct
  public void init() {
    System.out.println("Post construct initialized");
  }

  // ======================================
  // =           Public Methods           =
  // ======================================

  public void createCustomer(Customer customer) {
    System.out.println("Customer created");
    try {
      repository.addCustomer(customer);
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public Customer findCustomerById(Long id) {
    System.out.println("Find by id " + id);
    return repository.getList().stream().filter(c->c.getId().equals(id)).findFirst().get();

  }
}