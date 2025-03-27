package inheritance;

class Gpclass{
	public void gpmethod() {
		System.out.println("this is grandparent class");
	}
}

class ch1 extends Gpclass{
	public void ch1method() {
		System.out.println("this child 1 class");
	}
}

class ch2 extends Gpclass{
	public void ch2method() {
		System.out.println("this child 1 class");
	}
}

public class Multilevel1 {
	public static void main(String[] args) {
		Gpclass gp=new Gpclass();
		gp.gpmethod();
		
		ch1 cch1=new ch1();
		cch1.ch1method();
		cch1.gpmethod();
		
		ch2 cch2=new ch2();
		cch2.ch2method();
		cch2.gpmethod();
		
	}

}
