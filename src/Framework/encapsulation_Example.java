package Framework;

public class encapsulation_Example {

	// for encapsulation following steps follow:
	//Step 1: variable declaration-> global and private
	
	private String address;     // security
	
	//Step 2: variable initialization-> constructor with public
	
	public encapsulation_Example (String str)
	{
		address = str;
	}
	
	//Step 3:Utilize within a method with access level public
	
	public void getadress()
	
	{
		System.out.println(address);
	}
	
	
	
	
	
	
	
	
	
	
}
