package spring.springAOP;

public class User {

	String loginName;
	String password;
	String firstName;
	String country;
	int log=0;
	
	
	public void register(String loginName, String password, String firstName, String country)
	{
		this.loginName= loginName;
		this.password= password;
		this.firstName= firstName;
		this.country= country;
	}
	
	public void login() {
		if(this.loginName.equals(this.password))
		{
			System.out.println("Login Successful");
			log=1;
		}
		else
		{
			System.out.println("Login unsuccessful");
			log=0;
		}
	}
	
	public void logout()
	{
		
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [loginName=" + loginName + ", password=" + password + ", firstName=" + firstName + ", country="
				+ country + "]";
	}
	
}
