package functionalInterface;

@FunctionalInterface
interface Interface2{
	public void display2() ;
		
	
}

@FunctionalInterface
interface Interface3{
	public int string(String s);
}

public class FuctionalInterfaceInJava1 {
	public static void main(String[] args) {
		
		Interface2 i= ()->System.out.println("hello world");
		i.display2();
		
	    Interface3 i3= s->s.length();
	    int res = i3.string("hello world");
	    System.out.println("result is :" +res);
		
//		(String i) -> {return i.length()}
	}

}
