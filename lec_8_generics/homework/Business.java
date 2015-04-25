package lec_8_generics.homework;

/**

 Which statement inserted independently at line 9 will compile? (Choose all that apply.)
 Какие утверждения можно вставить в метод go, чтобы код скомпилировался?

 A.  return new ArrayList<Inn>();
 B.  return new ArrayList<Hotel>();
 C.  return new ArrayList<Object>();
 D.  return new ArrayList<Business>();
 */

import java.util.*;

class Business {
}

class Hotel extends Business {
}

class Inn extends Hotel {
}

public class Travel {
    ArrayList<Hotel> go() {
        // insert code here
    }
}
