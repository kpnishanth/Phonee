package Assignment2;


 public class Book {
    //Properties
    String bookName;
    String serialNumber;
    String authorName;

    //Methods

void setBookName()
{
System.out.println("set Book Name");
}
void setSerialNumber()
{
        System.out.println("set serialNumber");
}
void setauthorName()
{
    System.out.println("set authorName");

}
 public Book(String bookName, String serialNumber, String authorName)
 {
     this.bookName=bookName;
     this.serialNumber=serialNumber;
     this.authorName=authorName;
 }

}
