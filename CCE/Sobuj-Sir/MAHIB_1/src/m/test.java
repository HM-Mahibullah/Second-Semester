package mahib_1;

//import java.util.Map;

//class test
interface A {
    void msg();
}

interface B {
    void msg();
}

class c implements  B {
    @Override
    public void msg() {
        System.out.println("Hello from C");
    }

    public static void main(String args[]) {
        c o = new c();
        o.msg(); // This will invoke the msg() method of class C
   }
}

