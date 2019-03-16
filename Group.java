import java.util.ArrayList;
/**
 * Created by evrim on 29.04.2017.
 */
public class Group {
    private ArrayList<Student> waitingList;
    private ArrayList<Student> members;
    private ArrayList<WeeklyLog> history;
    private String groupName;
    private int memberCount;
    private int givenQuota;


    public Group(String name, int givenQuota)
    {
        members = new ArrayList<Student>();
        waitingList = new ArrayList<Student>();
        this.groupName= name;
        this.givenQuota = givenQuota;
        this.memberCount = 0;
        history = new ArrayList<WeeklyLog>();

    }

    public void addMember(Student newStudent)
    {
        if(memberCount<givenQuota)
        {
            members.add(newStudent);
            memberCount++;
            newStudent.setAdmin(true);
            newStudent.setInGroup(this);
        }
    }


    public void addWaiting(Student newWaiter)
    {
        if(newWaiter.getInGroup()==null) {
            if (memberCount == 0) {
                this.addMember(newWaiter);
            } else {
                waitingList.add(newWaiter);
            }
        }
    }

    public void leftGroup(Student goingStudent)
    {
        for(int i=0; i<=members.size()-1;i++)
        {
            if(members.get(i)==goingStudent)
            {
                goingStudent.setInGroup(null);
                goingStudent.setAdmin(false);
                memberCount--;
                members.set(i,null);
            }
        }
    }

        public ArrayList<Student> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Student> members) {
        this.members = members;
    }

    public ArrayList<WeeklyLog> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<WeeklyLog> history) {
        this.history = history;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public int getGivenQuota() {
        return givenQuota;
    }

    public void setGivenQuota(int givenQuota) {
        this.givenQuota = givenQuota;
    }

    public void acceptInvitation(Student wanter)
    {
        for(int i = 0; i<waitingList.size() ; i++)
        {
            if(waitingList.get(i).equals(wanter))
            {
                waitingList.remove(wanter);
                this.addMember(wanter);
            }
        }
    }

    public void rejectInvitation(Student unwanted)
    {
        for(int i = 0; i< waitingList.size();  i++)
        {
            if(waitingList.get(i).equals(unwanted))
            {
                waitingList.remove(unwanted);
            }
        }
    }

    public String toStringWaiters() {
        return "Group{" +
                "waitingList=" + waitingList +
                '}';
    }

    public String toStringMembers() {
        return "Group{" +
                "members=" + members +
                '}';
    }

    public String toStringHist() {
        return "Group{" +
                "history=" + history +
                '}';
    }
}

