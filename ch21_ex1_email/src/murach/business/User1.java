package murach.business;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USER1 database table.
 * 
 */
@Entity
@NamedQuery(name="User1.findAll", query="SELECT u FROM User1 u")
public class User1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String userid;

	private String email;

	private String firstname;

	private String lastname;

	public User1() {
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}