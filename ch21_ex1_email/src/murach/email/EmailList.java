package murach.email;


import murach.business.User1;
import murach.data.UserDB;



import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class EmailList {
    private User1 User1;
    private String message;
    
    public EmailList() {
    }
    
    @PostConstruct
    public void init() {
        User1 = new User1();
    }
    
    public String addToEmailList() {
        if (UserDB.emailExists(User1.getEmail())) {
        	System.out.println("Email found");
            message = "This email address already exists. " +
                    "Please enter another email address";
            return "index";
        } else {
            UserDB.insert(User1);
            return "thanks";
        }
    }

    public User1 getUser1() {
        return User1;
    }

    public void setUser1(User1 User1) {
        this.User1 = User1;
    }

    public String getMessage() {
        return message;
    }
}