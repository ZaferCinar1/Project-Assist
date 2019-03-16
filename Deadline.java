import java.time.Instant;
import java.util.Date;
/**
 * Created by evrim on 29.04.2017.
 */
public class Deadline {
    private String name;
    private String info;
    private Date dueDate;

    public Deadline(String name, Date dueDate) {
        this.name = name;
        this.dueDate = dueDate;
        info ="";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getInfo()
    {
        return info;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }

    public Date getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(Date dueDate)
    {
        this.dueDate = dueDate;
    }

    //projenin en havalı methodu
    public Date dateLeft()
    {
     return new Date (dueDate.getTime()-Date.from(Instant.now()).getTime());
    }
}
