/*
 * Does not set values to the urrent object
 */

package javaConcepts;

public class NotUsingThisToReferToCurrentObject {
	
	private int id;
	private String name;
	
	public NotUsingThisToReferToCurrentObject(int id, String name) {
		id=id;
		name =name;
	}
	
	public void display()
	{
		System.out.println("ID: "+id+" Name: "+name);
	}
	
	public static void main(String[] args)
	{
		NotUsingThisToReferToCurrentObject uObj1 = new NotUsingThisToReferToCurrentObject(1,"Name");
		uObj1.display();
	}
}
