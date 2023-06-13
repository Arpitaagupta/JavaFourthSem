package PrimitiveDataTypes;

import java.util.Arrays;

public class ArrayOfString {
    public static void main(String[] args) {
        char c[] = {'H','e','l','l','o'};

        //method-1
        for (int i=0; i<=4; i++){
            System.out.print(c[i]);
        }

        //method-2
        System.out.println("String C = "+ Arrays.toString(c));
    }


}
