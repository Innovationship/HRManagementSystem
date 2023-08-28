package Innovation.bo;

import java.sql.Connection;

public class Signup_bo 
{																	
	
	
	private String Username;
	private String First_Name;
	private String Last_Name;
	private String E_mail_Address;
	private String password;
	private String confir_password;
	
	
	public Signup_bo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Signup_bo(String username, String first_Name, String last_Name, String e_mail_Address, String password,
			String confir_password) {
		super();
		Username = username;
		First_Name = first_Name;
		Last_Name = last_Name;
		E_mail_Address = e_mail_Address;
		this.password = password;
		this.confir_password = confir_password;
	}
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getE_mail_Address() {
		return E_mail_Address;
	}
	public void setE_mail_Address(String e_mail_Address) {
		E_mail_Address = e_mail_Address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfir_password() {
		return confir_password;
	}
	public void setConfir_password(String confir_password) {
		this.confir_password = confir_password;
	}
	@Override
	public String toString() {
		return "Signup_bo [Username=" + Username + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
				+ ", E_mail_Address=" + E_mail_Address + ", password=" + password + ", confir_password="
				+ confir_password + "]";
	}

	public static Connection getConnection() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
