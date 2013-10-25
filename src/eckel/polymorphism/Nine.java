package eckel.polymorphism;

public class Nine {

    public static void main(String[] args) {
	Shared shared = new Shared();
	Rodent[] r = { new Mouse(shared), new Gerbil(), new Hamster() };
	for (Rodent rr : r) {
	    rr.beBorn();
	    rr.toDie();// Why are you all dying
	}
    }

}
