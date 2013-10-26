package eckel.typeinfo;

/**
 * ex 10
 * write a program to determine whether an array of char is a primitive type or a true Object
 */
public class Ten {
    public static void main(String[]args){
        char[] arr = new char[5];
        Character[] arrr=new Character[5];
        System.out.println(arr.getClass());
        System.out.println(arrr.getClass());
        System.out.println("Super class arr: "+arr.getClass().getSuperclass());
        System.out.println("Super class arrк: "+arrr.getClass().getSuperclass());
        System.out.println("arr: "+(arr instanceof Object));
        System.out.println("arrr: "+(arrr instanceof Object));
    }
}
