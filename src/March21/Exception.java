package March21;

public class Exception {
    public static void main(String[] args) {

        try {
            int x=10;
            int y=0;
            int z=x/y;


            System.out.println("Z = "+z);
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println("Exception e " +e);
        }
        finally {
            System.out.println("Finally Block");
        }

     //   System.out.println("Z = x/y ");




    }
}
