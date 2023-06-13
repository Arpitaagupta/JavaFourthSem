package Jan31;

class DemoClass {
   int  x=10;
    void funShow(){
        System.out.println("Show function from Demo Class ");
    }
}

public class DemoGet{
    public static void main(String[] args) {
        {
            DemoClass dc= new DemoClass();
            //new DemoClass().funShow();
            dc.funShow();
            System.out.println("x = "+dc.x);
        }
    }
}
