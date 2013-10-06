/**
 * Exercise 4:   (3) Modify Receipt.java so that the widths are all controlled by a single set of 
 * constant values. The goal is to allow you to easily change a width by changing a single value 
 * in one place.  
 */
package Strings12;

import java.util.Formatter;

/**
 * @author ¡Ó„‰‡Ì
 * 
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Receipt.main(args);

    }

}

class Receipt {
    private double total = 0;
    private String st1 = "15";
    private String st2 = "5";
    private String st3 = "10";
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
	f.format("%-" + st1 + "s %" + st2 + "s %" + st3 + "s\n", "Item", "Qty",
		"Price");
	f.format("%-" + st1 + "s %" + st2 + "s %" + st3 + "s\n", "----", "---",
		"-----");
    }

    public void print(String name, int qty, double price) {
	f.format("%-" + st1 + ".15s %" + st2 + "d %" + st3 + ".2f\n", name,
		qty, price);
	total += price;
    }

    public void printTotal() {
	f.format("%-" + st1 + "s %" + st2 + "s %" + st3 + ".2f\n", "Tax", "",
		total * 0.06);
	f.format("%-" + st1 + "s %" + st2 + "s %" + st3 + "s\n", "", "",
		"-----");
	f.format("%-" + st1 + "s %" + st2 + "s %" + st3 + ".2f\n", "Total", "",
		total * 1.06);
    }

    public static void main(String[] args) {
	Receipt receipt = new Receipt();
	receipt.printTitle();
	receipt.print("Jackís Magic Beans", 4, 4.25);
	receipt.print("Princess Peas", 3, 5.1);
	receipt.print("Three Bears Porridge", 1, 14.29);
	receipt.printTotal();
    }
}