package Assignment1;

public class Teacher {
    //Properties
    String name;
    String id;
    String subject;
    private int phoneNumber;

    //methods
    void setName()
    {
        System.out.println("setName");
    }

    void setId()
    {
        System.out.println("setId");
    }
    private void setPhoneNumber()
    {
        System.out.println("cannotAccess");
    }
    public Teacher(String name,String id,String subject,int phoneNumber)
    {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.phoneNumber=phoneNumber;

    }



}
