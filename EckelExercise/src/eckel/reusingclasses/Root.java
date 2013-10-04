package eckel.reusingclasses;

public class Root {
    private String s;

    public Root(String s) {
	this.s = s;
	System.out.println("Root");
    }

    public void dispose() {
	System.out.println("Rood dispose()");
    }

    protected Component1 component1 = new Component1(s);
    protected Component2 component2 = new Component2(s);
    protected Component3 component3 = new Component3(s);

}
