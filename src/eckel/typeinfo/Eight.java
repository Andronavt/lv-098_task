package eckel.typeinfo;

import javax.xml.transform.sax.SAXSource;

/**
 * ex 8
 * write a method that takes an object and recursively prints all the classes in that object's hierarchy.
 */
class A {
    private int fromA;
    private String fromAA;
}

class B extends A {
    private int fromB;
    private String fromBB;
}

class C extends B {
    private int fromC;
    private String fromCC;
}

public class Eight {

    public static void classHieratchy(Object o) {
        Object[] fields = o.getClass().getDeclaredFields();

        if (o.getClass().getSuperclass() != null) {
            System.out.println(o.getClass() + ": " + o.getClass().getSuperclass());
            try {
                classHieratchy(o.getClass().getSuperclass().newInstance());
            } catch (InstantiationException e) {
                e.getMessage();
            } catch (IllegalAccessException ex) {
                ex.getMessage();
            }
        }
        for (Object obj : fields) {
            System.out.println("fields: " + obj);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hi");
        classHieratchy(new C());
    }

}
