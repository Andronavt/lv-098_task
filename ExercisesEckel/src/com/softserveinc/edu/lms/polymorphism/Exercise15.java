/**
 * 
 */
package com.softserveinc.edu.lms.polymorphism;

/**
 * @author Maryan
 *
 */

class Glyph {
    public void draw() {
	System.out.println("Glyph.draw()");
    }
    
    public Glyph() {
	System.out.println("Glyph() before draw()");
	draw();
	System.out.println("Glyph() after draw()");
    }
}

class RectangularGlyph extends Glyph {
    private int lenght = 3;
    private int width = 5;
    public RectangularGlyph(int l, int w) {
	lenght = l;
	width = w;
	System.out.println("RectangularGlyph.RectangularGlyph(), leght = " + lenght 
		+ ", width = " + width);
    }
    
    @Override
    public void draw() {
	System.out.println("RectangularGlyph.draw(), leght = " + lenght 
		+ ", widht = " + width);
    }
}

class RoundfGlyph extends Glyph {
    private int radius = 1;
    public RoundfGlyph(int r) {
	radius = r;
	System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
    
    @Override
    public void draw() {
	System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class PolyConstructors {
    public static void main(String[] args) {
	new RoundfGlyph(5);
	new RectangularGlyph(5, 10);
    }
}

public class Exercise15 extends PolyConstructors {
    
}
