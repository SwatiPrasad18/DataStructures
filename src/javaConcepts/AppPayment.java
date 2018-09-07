package javaConcepts;

public class AppPayment implements PaymentInterface {
	
	public void display()
	{
		System.out.println("Implementing interface Payment");
	}
	
	public static void main(String[] args) {
		PaymentInterface pay = new AppPayment();
		pay.display();
		
		AppPayment pay2 = new AppPayment();
		pay2.display();
		
	}

}
