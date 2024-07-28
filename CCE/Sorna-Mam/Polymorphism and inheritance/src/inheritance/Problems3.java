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

public class Problems3 {
    
    public static void main(String[] args) {
        
         Employee[] employees = new Employee[5];
        
        // Initialize each Employee object and store it in the array
        employees[0] = new Employee("Rahim", 25, "01565456789", "Dubai", 15000);
        employees[1] = new Employee("Karim", 34, "014444444444", "Dubai", 16500);
        employees[2] = new Employee("Sohel", 28, "01777777777", "New York", 18000);
        employees[3] = new Employee("Nadia", 30, "01888888888", "London", 20000);
        employees[4] = new Employee("Farhan", 22, "01999999999", "Paris", 13500);
    
        for (int i = 0; i < employees.length; i++) {
            
        
        System.out.println("================================================");
        System.out.println("Employee Data: ");
        System.out.println("Name : "+employees[i].name);
        System.out.println("Age  : "+employees[i].age);
        System.out.println("Phone Number: "+employees[i].phoneNumber);
        System.out.println("Address : "+employees[i].address);
         employees[i].printSalary();
        }
                Manager manager = new Manager("Karim",34,"014444444444","Dubai",16500);
        System.out.println("================================================");
        System.out.println("Manager Data: ");
        System.out.println("Name : "+manager.name);
        System.out.println("Age  : "+manager.age);
        System.out.println("Phone Number: "+manager.phoneNumber);
        System.out.println("Address : "+manager.address);
        manager.printSalary();
        System.out.println("================================================");

    }
}
