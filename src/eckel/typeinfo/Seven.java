package eckel.typeinfo;
/*
ex 7
Modify SweetShop.java so that each type of object creation is controlled by a command-line argument.
That is, if your command line is "java SweetshopCandy," then only the Candy object is created.
Notice how you can control which Class objects are loaded via the commandline argument.
 */

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class Seven {
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("Error");
            System.exit(0);
        }
        Class c = null;
        try {
            c=Class.forName(args[0]);
            System.out.println("This is: "+args[0]);
        }catch (ClassNotFoundException e){
            System.out.println("Could not find: "+args[0]);
        }
    }
} /* Output:
inside main
Loading Candy
After creating Candy
Loading Gum
After Class.forName("Gum")
Loading Cookie
After creating Cookie
*///:~

