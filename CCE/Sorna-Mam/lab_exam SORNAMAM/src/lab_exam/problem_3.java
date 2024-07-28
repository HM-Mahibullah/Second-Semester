class Member
{
    String name;
    int age;
    String phonenumber;
    String address;
    double salary;
     public void printSalary()
 {
 System.out.println("Salary : " + salary);
 }
}

class Employee extends Member
{
    public Employee(String name,int age,String phonenumber,String address,double salary)
    {
       this.name=name;
       this.age=age;
       this.address=address;
       this.phonenumber=phonenumber;
       this.salary=salary;
       
    }
}
class Manager extends Member
{
 public Manager(String name,int age,String phonenumber,String address,double salary)
 {

 }
}
public class problem_3
{
    public static void main(String[] args) {
        Employee employee=new Employee("Rahim",10,"01902996738","kalaskati",1000);
        Manager manager = new Manager("Karim",34,"014444444444","Dubai",16500);
        
System.out.println("================================================");
 System.out.println("Employee Data: ");
 System.out.println("Name : "+employee.name);
 System.out.println("Age : "+employee.age);
 System.out.println("Phone Number: "+employee.phonenumber);
 System.out.println("Address : "+employee.address);
 employee.printSalary();
 System.out.println("================================================");
 System.out.println("Manager Data: ");
 System.out.println("Name : "+manager.name);
 System.out.println("Age : "+manager.age);
 System.out.println("Phone Number: "+manager.phonenumber);
 System.out.println("Address : "+manager.address);
 manager.printSalary();

System.out.println("================================================");
    }
}

