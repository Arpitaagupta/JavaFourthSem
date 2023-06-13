package Feb21;

abstract class xyz{
    abstract void show();
}

public class AbstractUseDemo {
    void show()
    {
        System.out.println("From Abstract class");
    }

    public static void main(String[] args) {
       // xyz x1 = new
        AbstractUseDemo a1 = new AbstractUseDemo();
        a1.show();
        a1.show();
    }
}
