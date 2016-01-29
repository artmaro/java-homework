package cdi.example;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
public class ProfileInterceptor {

  // ======================================
  // =             Attributes             =
  // ======================================


  // ======================================
  // =          Lifecycle methods         =
  // ======================================

  @PostConstruct
  public void logMethod(InvocationContext ic) throws Exception {
    System.out.println(ic.getTarget().toString());
    System.out.println(">>>" + ic.getTarget().toString());
    try {
      ic.proceed();
    } finally {
      System.out.println("<<<" + ic.getTarget().toString());
      System.out.println(ic.getTarget().toString());
    }
  }

  // ======================================
  // =           Public Methods           =
  // ======================================

  @AroundInvoke
  public Object profile(InvocationContext ic) throws Exception {
    long initTime = System.currentTimeMillis();
    try {
      return ic.proceed();
    } finally {
      long diffTime = System.currentTimeMillis() - initTime;
      System.out.println("###" + ic.getMethod() + " took " + diffTime + " millis");
      System.out.println(ic.getMethod() + " took " + diffTime + " millis");
    }
  }
}
