package ETicaretBackend.entities.concretes;

import ETicaretBackend.entities.abstracts.Entitiy;

public class User  implements Entitiy{
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	
	public User() {
		
	}

	public User(int id, String firstName, String lastName, String eMail, String pasword) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = pasword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPasword() {
		return password;
	}

	public void setPasword(String pasword) {
		this.password = pasword;
	}
	
	

}
