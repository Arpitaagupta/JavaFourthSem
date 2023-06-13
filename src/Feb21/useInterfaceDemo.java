package Feb21;

interface A
{
    void show();
}
//no object of interface

interface B{
    void show1();
}
interface C extends B{
    void showM2();
}

public class useInterfaceDemo implements A,B,C{
    public void show(){
        System.out.println("Inside A Interface");
    }

    @Override
    public void show1() {
        System.out.println("Inside B Interface");
    }

    @Override
    public void showM2() {
        System.out.println("Inside C Interface");

    }

    public static void main(String[] args) {
        useInterfaceDemo u1 = new useInterfaceDemo();
        u1.show();
        u1.show1();
        u1.showM2();
    }
}
