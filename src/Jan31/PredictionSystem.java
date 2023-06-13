package Jan31;

import java.util.Scanner;

public class PredictionSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
       String name = sc.next();

       if(name.endsWith("a") || name.endsWith("e") || name.endsWith("i") || name.endsWith("o") || name.endsWith("u")){
           System.out.println("Name of a girl.");
        }
       else {
           System.out.println("Name of a boy.");
       }
    }
}
