
class ParentClass {
  private void parentMethod() {
        System.out.println("This is parent class");
        
    }
}
class ChildClass extends ParentClass
{
    public void childMethod()
    {
        System.out.println("This is child class");
    }

}



public class Problems1 {
    public static void main(String[] args) {
        ParentClass p = new ParentClass();
        ChildClass c = new ChildClass();
//        p.parentMethod(); Error
        c.childMethod();
//        c.parentMethod();  Error
    }
}
