import java.util.Date;
/**
 * Created by evrim on 29.04.2017.
 */
public class Instructor extends User {
    public Instructor(String name, String password, String mailAdress, String status)
    {
        super(name,password,mailAdress, status);
    }

    public Course createCourse(String name, String sectionCode)
    {
       Course createdCourse = new Course(name, sectionCode);
       return createdCourse;
    }

    public void setDeadline(String deadlineName, Date dueDate)
    {
        Deadline date = new Deadline ( deadlineName, dueDate);
        System.out.println("Deadline has been created");
    }

    public void editDeadline(Deadline date,String info)
    {
       date.setInfo(info);
    }

    public Group createGroup(String name, int quota)
    {
        Group groups = new Group(name,quota);
        return groups;
    }
}
