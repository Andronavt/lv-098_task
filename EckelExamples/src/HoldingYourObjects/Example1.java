package HoldingYourObjects;

import java.util.ArrayList;
import java.util.List;

class Gerbil {
	private int a;
	Gerbil(int a) {
		this.a = a;
	}
	void hop() {
		System.out.println(a + " Gerbil Hopping ");
	}
}

public class Example1 {
	public static void main(String[] args) {
		List<Gerbil> gList = new ArrayList<Gerbil>();
		for (int i = 0; i < 5; i++) {
			gList.add(new Gerbil(i));

		}

		for(Gerbil i :gList){
			i.hop();
		}
	}

}
