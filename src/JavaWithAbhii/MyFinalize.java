package JavaWithAbhii;
//Garbage Collection in Java

class A{
    A(){    //Primary Constructor of A
        System.out.println("Inside Constructor A");
        }

  //  protected void finalize()
    {
        System.out.println("Finalize A");
    }
    }



public class MyFinalize {
     void test()    //return type --> void/null
            //static -->
    {
        A ob = new A();
       // ob.finalize(); //finalize can be called by object itself


    }

    public static void main(String[] args) {
        {
           // test();
            System.gc(); //requests the garbage collector to perform cleaning up operations
            MyFinalize obj = new MyFinalize();
            obj.test();


            /*there are two ways to call a method
            * 1.By creating an object of the class and calling the methods with the help of objects inside main function.
            * 2.By declaring the method as static and calling it directly inside main function
            * */

        }
    }
}
