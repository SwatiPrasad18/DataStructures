package javaConcepts;

public class ParameterizedConstructor {

	private int id;
	private String name;
	public ParameterizedConstructor(int id, String name) {
		this.id =id;
		this.name = name;
		
	}
	
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
	}
	public static void main(String[] args) {
		ParameterizedConstructor pCon = new ParameterizedConstructor(1, "Mist");
		pCon.display();
		
	}
}
