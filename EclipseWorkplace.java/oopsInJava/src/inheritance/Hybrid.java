package inheritance;

interface newinterface{
	public void intermethod();
}

class Parentclass1{
	public void Parentclassmethod() {
		System.out.println("this is parent class");
		
	}
}

class childclass11 extends Parentclass1 implements newinterface{

	@Override
	public void intermethod() {
		System.out.println("this is interface");
		
	}
	
}
public class Hybrid {
	public static void main(String[] args) {
		Parentclass1 pc=new Parentclass1();
		pc.Parentclassmethod();
		
		childclass11 cc=new childclass11();
		cc.intermethod();
		
	}

}
