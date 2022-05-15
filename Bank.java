package bank;

class Account{
	public String name;
	protected String email;
	private String password;
	//getters and setters
	
	public String getPassword()
	{
		return this.password;
	}
	public void setPassword(String pass)
	{
		this.password=pass;
	}
} 
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1= new Account();
		account1.name="new";
		account1.email="abc@gmail.com";
		//account1.password="abc@123"; //private member can't access outside the class . 
		account1.setPassword("abc@123");
		System.out.println(account1.getPassword());
	}

}
