package javaConcepts;

public class UsingThisToReferToCurrentObject {
	private int id;
	private String name;
	
	public UsingThisToReferToCurrentObject(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("ID: "+id+" Name: "+name);
	}
	
	public static void main(String[] args)
	{
		UsingThisToReferToCurrentObject uObj1 = new UsingThisToReferToCurrentObject(2, "String");
		uObj1.display();
		
	}

}
