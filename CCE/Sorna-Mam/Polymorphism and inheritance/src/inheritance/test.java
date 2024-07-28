
package inheritance;

  class Member{
    String name;
    int age;
   String phoneNumber;
    String address;
    double salary;
  public void printSalary()
  {
      System.out.println("Salary : " + salary);
  }
}
class Employee extends Member
{
    public Employee(String name,int age,String phoneNumber,String address,double salary)
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
}
class Manager extends Member
{
    public Manager(String name,int age,String phoneNumber,String address,double salary)
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
}
public  class test
{
    public static void main(String[] args) {
        Employee e=new Employee("hjsdkfaj" ,02,  "00000000",  "dh",3);
        System.out.println(""+e.address);
        
        
    }
}