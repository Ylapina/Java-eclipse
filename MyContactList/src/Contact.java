
public class Contact {
       private String FirstName;
       private String LastName;
       private String Email;
       private String Phone;
public void setFirstName(String FirstName) {
	this.FirstName = FirstName;
	}
public String getFirstName () {
	return FirstName;
	}
public void setLastName(String LastName) {
	this.LastName= LastName;
}
public String getLastName() {
	return LastName;
}
public void setEmail(String Email) {
	this.Email = Email;
}
public String getEmail() {
	return Email;
}
public void setPhone(String Phone) {
	this.Phone= Phone;
}
public String getPhone() {
	return Phone;
}
public String DisplayContact() {
	String Contact= "-----------------------------------------/n";
	Contact += "---- Current Contact -----------------------\n";
    Contact += "--------------------------------------------\n";
    Contact += "Name:           " + FirstName + " " + LastName + "\n";
    Contact += "Email Address:  " + Email + "\n";
    Contact += "Phone Number:   " + Phone + "\n";
    Contact += "--------------------------------------------\n";
    return Contact;   

}

   





}
