package PredfinedFunctionInterface;

import java.util.function.Function;

public class FunctionInJava {
public static void main(String[] args) {
	/*
	 * Function:
	 * it will atke one parameter then perform action and return the value*/
	
	Function<String ,Integer> f=(s)->s.length();
	int res =f.apply("hello wooorlld:");
	System.out.println(res);
	
	
	Function<Integer ,Integer> f1=(s)->s*s;
	int res1 =f1.apply(3);
	System.out.println(res1);
		
}
}
