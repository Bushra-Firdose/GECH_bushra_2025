package inheritance;


class grandParentClass{
	public void grandParentmethod(){
		System.out.println("This is Grand Parent Class");
	}
}

class ParentClass extends grandParentClass{
	public void Parentmethod(){
		System.out.println("This is  Parent Class");
	}
}

class ChildClass extends ParentClass{
	public void childmethod(){
		System.out.println("This is  child  Class");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		
		grandParentClass grand = new grandParentClass();
		grand.grandParentmethod();
		
		System.out.println("-------------------------------------------");
		
		ParentClass parent =new ParentClass();
		parent.Parentmethod();
		parent.grandParentmethod();
		
		System.out.println("-------------------------------------------");
	
		ChildClass child =new ChildClass();
		child.Parentmethod();
		child.grandParentmethod();
		child.childmethod();
		
		
		
		

	}

}
