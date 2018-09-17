package Authors;

public class Author {
	
	private String Name;
	private String Email;
	private char Gender;

	public Author(String InputName, String InputEmail, char InputGender) {
		
	this.Name=InputName;
	this.Email=InputEmail;
	this.Gender=InputGender;
	
	}
	
	public String getName() {
		return Name;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String InputEmail) {
		this.Email=InputEmail;
	}
	
	public char getGender() {
		return Gender;
	}
	
	public String toString() {
		return this.Name+" ("+this.Gender+") at "+this.Email;
	}
}
