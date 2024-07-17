import javax.persistence.*;
@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private long fees;
    public Student() {}
    public Student(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public long getFees()
    {
        return fees;
    }
    public void setFees (long fees)
    {
        this.fees = fees;
    }
}