package stringsInJava;

public class StringsInJava2 {
	public static void main(String[] args) {
		/*
		 * String methode:
		 * 1.equals
		 * 2.==
		 * 3.concat
		 * 4.touppercase
		 * 5.tolowercase
		 * 6.
		 * 7.trim
		 * 8.startswith
		 * 9.endswith
		 * 10.strip
		 * 11.equalsignorecase
		 * 12.isBlank()*/
		
		String str1=new String("Hello world  ");
		String str2=new String("hello world");
		
		//1.equals
		System.out.println("equals:" +str1.equals(str2));
		//2.equalignore
		System.out.println("equalsignorecase:" +str1.equalsIgnoreCase(str2));
		//3.==
		System.out.println("== :" + (str1==str2));
		//4. concat
		System.out.println("concat: "+str1.concat(str2));
		//5. toupper
		System.out.println(" touppercase :"+str1.toUpperCase());
		//6.tolower
		System.out.println("tolowercase :"+str1.toLowerCase());
		//7.trim
		System.out.println("trim: "+str1.trim());
		//8.strip
		System.out.println("strip: "+str1.strip());
		//9.isBlnk
		System.out.println("isBlank: "+str1.isBlank());
		//10.startswith
		System.out.println("startswith :"+str1.startsWith("H"));
		//11.endswith
		System.out.println("endswiths: "+str1.endsWith("d"));
		
	}

}
