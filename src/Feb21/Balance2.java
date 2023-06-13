package Feb21;


public class Balance2{
    String str;
    double bal;

   public  Balance2(String s, double d) {
        str = s;
        bal = d;
    }

   public  void show() {
        System.out.println(" Account holds is " +str + "and balance is " + bal);
    }
}