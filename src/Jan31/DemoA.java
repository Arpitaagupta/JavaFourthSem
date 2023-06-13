package Jan31;

public class DemoA {
    public static void main(String[] args) {
        int x[] = {1,3,5,112,55};
        System.out.println(x.length);
        int i =120;
        byte b =12;
        short s =(short)i;
        System.out.println("S =" +i);
        System.out.println("Byte value of b = " +b);
        short y = b;
        short z = (short)i;
        System.out.println("Value of y after widening type casting =" +s);
        System.out.println("Value of z after narrowing type casting =" +z);
    }
}
