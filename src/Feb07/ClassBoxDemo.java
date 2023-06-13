package Feb07;

import javax.swing.*;

class Box1{
     double width, height, depth;

}

public class ClassBoxDemo {
    public static void main(String[] args) {
        Box1 b1;
        b1 = new Box1();
        b1.width = 10;
        b1.depth = 20;
        b1.height = 30;
        double vol;
        vol = b1.width * b1.height * b1.depth ;
        System.out.println("Volume of Box = " +vol);


    }

}



