package lec_17_lambdas.examples.listing_4;

/**


 */

class Hello {
    public Runnable r = new Runnable() {
        public void run() {
            System.out.println(this);
            System.out.println(toString());
        }

        public String toString() {
            return "Runnable";
        }
    };

    public String toString() {
        return "Hello's custom toString()";
    }
}


class HelloOuterRef {
    public Runnable r = new Runnable() {
        public void run() {
            System.out.println(HelloOuterRef.this);
            System.out.println(HelloOuterRef.this.toString());
        }
    };

    public String toString() {
        return "Hello's custom toString()";
    }
}

class HelloLambda {
    public Runnable r = () -> {
        System.out.println(this);
        System.out.println(toString());
    };

    public String toString() {
        return "Hello's custom toString()";
    }
}

public class LexicalScope {
    public static void main(String[] args) {
        System.out.printf("Hello");
        Hello h1 = new Hello();
        h1.r.run();
        System.out.printf("HelloOuterRef");
        HelloOuterRef h2 = new HelloOuterRef();
        h2.r.run();
        System.out.printf("HelloLambda");
        HelloLambda h = new HelloLambda();
        h.r.run();
    }

    public String toString() {
        return "Outer";
    }
}
