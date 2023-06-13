package Feb21;

class abc {
    void show3(){
        System.out.println("from class concrete method");
    }
}

abstract class abcd extends abc{
    abstract void show();
    void show1(){
        System.out.println("From Abstract class concrete method.");
    }

}


public class AbstractUse {
    void show()
    {
        System.out.println("From Abstract class");
    }

    void show2()
    {
        System.out.println("from abstract class concrete method");
    }

    public static void main(String[] args) {
        // xyz x1 = new xyz();

        AbstractUseDemo a1 = new AbstractUseDemo();
        a1.show();
        a1.show();


        AbstractUseDemo b2;
        b2=a1;
        b2.show();
    }
}
