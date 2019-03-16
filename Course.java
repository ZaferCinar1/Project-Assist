import java.util.ArrayList;
/**
 * Created by evrim on 29.04.2017.
 */
public class Course {
    private ArrayList<User> members;
    private ArrayList<Group> groups;
    private ArrayList<Deadline> deadlines;
    private ArrayList<Files> files;
    private ArrayList<WeeklyLog> weeklyLogs;
    private String name;
    private String sectionCode;
    private String verificationCode;

    public Course(String name, String sectionNumber)
    {
        this.name = name;
        this.sectionCode = sectionNumber;
        verificationCode = "" + (int) (Math.random() * 9 + 1)*Math.pow(10,6);
        groups = new ArrayList<Group>();
        deadlines = new ArrayList<Deadline>();
        members = new ArrayList<User>();
        weeklyLogs = new ArrayList<WeeklyLog>();
        files = new ArrayList<Files>();
    }

    public ArrayList<User> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<User> members) {
        this.members = members;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public ArrayList<Deadline> getDeadlines() {
        return deadlines;
    }

    public void setDeadlines(ArrayList<Deadline> deadlines) {
        this.deadlines = deadlines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String toStringMembers() {
        return "Course{" +
                "members=" + members +
                '}';
    }

    public String toStringGroups() {
        return "Course{" +
                "groups=" + groups +
                '}';
    }

    public String toStringDeadlines() {
        return "Course{" +
                "deadlines=" + deadlines +
                '}';
    }

    public String toStringFiles() {
        return "Course{" +
                "files=" + files +
                '}';
    }

    public String toStringLogs() {
        return "Course{" +
                "weeklyLogs=" + weeklyLogs +
                '}';
    }
}
