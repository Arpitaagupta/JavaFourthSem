package Jan31;

public class Finalvalue {
    public static void main(String[] args) {
        int x = 7;
        x = x+2;
        System.out.println("Value of x after adding 2 = " +x);

        final int y = 8;
       // y = y+1;
           //Error --> java: cannot assign a value to final variable y

        //System.out.println("Value of y after adding 1=" +y);


    }
}
