/**
 * Created by evrim on 29.04.2017.
 */
public class Student extends User {
    private Group inGroup;
    private boolean admin;

    public Student(String name, String password, String mailAdress, String status)
    {
        super(name,password,mailAdress,status);
        inGroup = null;
        admin = false;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void joinCourse(Course course, String verificationCode)
    {
        if(verificationCode.equals(course.getVerificationCode()))
        {
            System.out.println("You added this course");
        }
        else
            System.out.println("Wrong code, please try again");
    }

    public boolean inGroup()
    {
       if(inGroup==null)
       {
           return false;
       }
       return true;
    }

    public Group getInGroup() {
        return inGroup;
    }

    public void setInGroup(Group inGroup) {
        this.inGroup = inGroup;
    }

    public void sendRequest(Group wanted)
    {
        if(wanted.getMemberCount()!=wanted.getGivenQuota() && wanted.getMemberCount()!=0)
        {
            wanted.addWaiting(this);
        }
        else if (wanted.getMemberCount()==0)
        {
            wanted.addMember(this);
        }
    }

    public void leaveThem(Group a)
    {
        if(this.inGroup==a)
        {
            a.leftGroup(this);
        }
    }
}
