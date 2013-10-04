/**
 * 
 */
package Polymorphism_7;

/**
 * @author Богдан
 * 
 */
public class Exercise15 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	PolyConstructors.main(args);

    }

}

class Glyph {
    void draw() {
	System.out.println("Glyph.draw()");
    }

    Glyph() {
	System.out.println("Glyph() before draw()");
	draw();
	System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
	radius = r;
	System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
	System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph{
    private int perymetre = 25;

    RectangularGlyph(int p) {
	perymetre = p;
	System.out.println("RectangularGlyph.RectangularGlyph(), perymetre = " + perymetre);
    }

    void draw() {
	System.out.println("RectangularGlyph.draw(), perymetre = " + perymetre);
    }
}

class PolyConstructors {
    public static void main(String[] args) {
	new RoundGlyph(5);
	new RectangularGlyph(30);
    }
}
