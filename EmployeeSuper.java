import java.util.Scanner;
class Employer
{
 int Empid,Salary;
 String Name,Address;
 Employer(int eid ,int sal,String name,String addr)
 {
 Empid=eid;
 Salary=sal;
 Name=name;
 Address=addr;
 }
}
class Teacher extends Employer
{
  String department,Subjects_taught;
  Teacher(int eid,int sal,String name,String addr,String dept,String sub)
  {
    super(eid,sal,name,addr);
    department=dept;
    Subjects_taught=sub;
  }
  void display() 
  {
    System.out.println("employeeid:" +Empid);
    System.out.println("employee name:" +Name);
    System.out.println("salary:" +Salary);
    System.out.println("address:" +Address);
    System.out.println("department:" +department);
    System.out.println("Subjects taught:" +Subjects_taught);
    }
 }
 class EmployeeSuper
 {
 public static void main(String args[])
 {
    int i,n,eid,Salary;
    String name,Subj,address,dept;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of employees:");
    n=sc.nextInt();
    Teacher teacher[]=new Teacher[n];
    for(i=0;i<n;i++)
    {
      System.out.println("\n enter the employee id:");
      eid=sc.nextInt();
      System.out.println("\n enter the employee name:");
      name=sc.next();
      System.out.println("\n enter the salary:");
      Salary=sc.nextInt();
      System.out.println("\n enter the address:");
      address=sc.next();
      System.out.println("\n enter the department:");
      dept=sc.next();
      System.out.println("\n enter the subject taught:");
      Subj=sc.nextLine();
      sc.nextLine();
      teacher[i]=new Teacher(eid,Salary,name,address,dept,Subj);
     }
     System.out.println("\n Details of teachers");
     System.out.println("\n_____________________");
     for(i=0;i<n;i++)
     {
        teacher[i].display();
     }
 }
 }
 
