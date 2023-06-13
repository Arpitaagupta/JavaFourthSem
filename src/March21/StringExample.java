package March21;

public class StringExample {

    public static void main(String[] args) {
        char[] c= {'a','b','c','d'};
        String s1 = new String(c);
        System.out.println("s1 :" +s1);

        String s2;
        s2 = s1;
        System.out.println("s2 :" +s2);

        char chars[] = {'a','b','c','d','e','f'};
        String s3 = new String(chars, 2, 3);
        System.out.println("s3 :" +s3);
        s3 = "Hello";
        System.out.println("New s3 :" +s3);

        /* Java String is immutable which means it cannot be changed.
        Whenever we change any string, a new instance is created. */

        String s4 = new String("Hello Hi");
        System.out.println("s4 :" +s4);
        s4 = "New Hi Fi";
        System.out.println("New s4 :"+s4);

        byte[] ascii = {65,66, 67, 68, 69, 70};
        String s5 = new String(ascii);
        System.out.println("s5 :" +s5);

        //String Functions

        //.length() --> returns the length of string
        System.out.println("String length s5 :" +s5.length());
        System.out.println("String length s5 ".length());

        //Operator Overloading
        int age = 9;
        String s6 = "He is " +age + "years old.";
        System.out.println("s6 :"+s6);

        String s7 = s6 + "!!!";
        System.out.println("s7 :"+s7);
        System.out.println("s6 :"+s6);

        String s8 = "Hello World from Java";
        char ch=s8.charAt(4);
        System.out.println("s8.CharAt(1)" +ch);  //charAt() --> Returns character at given index position

        //.toCharArray() --> converts the given string to character
        char ch1[]=s8.toCharArray();
        for (int i=0; i<ch1.length; i++){
            System.out.println(ch1[i]);
        }



    }
}
