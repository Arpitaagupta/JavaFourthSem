package Jan31;

public class DemoFinal {
    public static void main(String[] args) {
        //program to find area of circle

        final float pi = 3.14f;
        float radius = 2.4f;
        System.out.println("Area of circle = " +(pi*radius*radius));
       // pi = pi-1;
            //Error --> java: cannot assign a value to final variable pi
        System.out.println("Area of circle = " +(pi*radius*radius));


    }
}
