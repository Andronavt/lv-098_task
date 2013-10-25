package eckel.reusingclasses;

public class Stem extends Root {
    private String s;

    public Stem(String s) {
	super(s);
	this.s = s;
	System.out.println("Stem");
    }

    @Override
    public void dispose() {
	System.out.println("Stem dispose()");
	super.dispose();
    }

    protected Component1 component1 = new Component1(s);
    protected Component2 component2 = new Component2(s);
    protected Component3 component3 = new Component3(s);

}
