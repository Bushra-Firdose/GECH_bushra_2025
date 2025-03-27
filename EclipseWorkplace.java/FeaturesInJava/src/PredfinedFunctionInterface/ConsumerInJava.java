package PredfinedFunctionInterface;

import java.util.function.Consumer;

public class ConsumerInJava {
public static void main(String[] args) {
	/*
	 * Consumer:
	 * it will consume the value but not return anything*/
	
	Consumer<String> c=(s)->System.out.println(s);
	c.accept("this is cosumer");
}
}
