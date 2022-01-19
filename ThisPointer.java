class Student
{
    int id;
    String name;
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println("ID: "+id);
        System.out.println("NAME: "+name);
    }
}
public class ThisPointer
{
    public static void main(String[] args)
    {
        Student s=new Student(99,"Shreeyash");
        s.display();
    }
}
