import java.util.ArrayList;
/**
 * Created by evrim on 29.04.2017.
 */
public class User {
    private String name;
    private String password;
    private String mailAdress;
    private String status;
    protected ArrayList<Course> courses;

    public User (String name, String password, String mailAdress, String status)
    {
        this.name = name;
        this.password = password;
        this.mailAdress = mailAdress;
        this.status = status;
        courses = new ArrayList<Course>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)

    {
        name = newName;
    }

    public String getPassword()

    {
        return password;
    }

    public void setPassword( String newPassword)
    {
        password = newPassword;
    }

    public String getMail()
    {
        return mailAdress;
    }

    public void setMail( String mail)
    {
        mailAdress = mail;
    }

    public boolean logIn(String name, String password)
    {
        if (name.equals(this.name) && password.equals(this.password))
        {
            return true;
        }
        else
            System.out.println("You enter wrong information, please try again");
        return false;
    }

    public void logOut()
    {
        System.out.println("See you later");
        System.exit(0);
    }

    public void signUp(String name, String password, String mail, String status)
    {
        User created = new User(name,password,mail,status);
    }

    public boolean isStudent()
    {
        if(status.equals("student"))
        {
            return true;
        }
        else
            return false;
    }

    public boolean isInstructor()
    {
        if(status.equals("instructor"))
        {
            return true;
        }
        else
            return false;
    }
    public ArrayList<Course> getCourses()
    {
        return courses;
    }

    public String toStringCourseList() {
        return "User{" +
                "courses=" + courses +
                '}';
    }
}
