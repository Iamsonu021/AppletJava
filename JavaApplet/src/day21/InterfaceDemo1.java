package day21;

public class InterfaceDemo1 {

}

interface A{
	public default void m1() {
		System.out.println("Hello");
	}
}
interface B extends A{
	public default void m1() {
		System.out.println("Hello");
		
	}
}
interface C extends A{
	public default void m1() {
		System.out.println("hello");
	}
}