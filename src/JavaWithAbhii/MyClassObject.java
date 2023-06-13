package JavaWithAbhii;

class P
{
    String obname = "";
    public P (String nm){
        System.out.println("Class-P constructor called for object : " +obname);
    }

    public void finalize()
    {
        System.out.println("Class-P finalize called for object : " +obname);
    }


}

class Q
{
    Q()  //public constructor of Q
    {
        P ob1 = new P("OB1");
        P ob2 = new P("OB2");
    }
}

public class MyClassObject {
    public static void main(String[] args) {
        {
            Q obj = new Q();
            System.gc();
        }
    }

}
