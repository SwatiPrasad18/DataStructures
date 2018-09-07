/*
 * instanceof operator cannot be used without inheritance
 */

package javaConcepts;

class A1{}
class B1{}
class C1 extends B1{}

public class InstanceOfOperator extends A1 {
	public static void main(String[] args)
	{
		A1 a = new A1();
		A1 b = new InstanceOfOperator();
		System.out.println(a instanceof A1);
		System.out.println(a instanceof InstanceOfOperator);
		
		System.out.println(b instanceof A1);
		System.out.println(b instanceof InstanceOfOperator);
		
		C1 c = new C1();
		System.out.println(c instanceof B1);
		
	}
}
