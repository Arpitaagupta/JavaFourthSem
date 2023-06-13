package March21;

public class stringMethods {
    public static void main(String[] args) {
        String s11 = "Hello";
        String s21 = "Hello";
        String s31 = "Good-bye";
        String s41 = "HELLO";

        /* .equals() --> returns true if the given string is same as entered string
                -->It returns a boolean value.
                -->Case sensitive */
        System.out.println(s11 + " equals " + s21 + " --> " + s11.equals((s21)));
        System.out.println(s11 + " equals " + s31 + " --> " + s11.equals((s31)));
        System.out.println(s11 + " equals " + s41 + " --> " + s11.equals((s41)));

        //equalsIgnoreCase() --> returns true if the given string is same as entered string, ignoring the case of character.
        System.out.println(s11 + " equalsIgnoreCase " + s41 + " --> " + s11.equalsIgnoreCase((s41)));

        //startsWith(" ") --> returns true if given string starts with entered string.
                 //-->It returns a boolean value
        System.out.println("Footbar ".startsWith("Foo"));

        /* endsWith(" ") --> returns true if given string ends with entered string.
                  -->It returns a boolean value
        */
        System.out.println("Foobar".endsWith("al"));

        String s10 = "IamArpita";
        String s12 = new String(s10);
        String s13 = "Iamabc";
        String s14 = "abcE";
        System.out.println(s10 + " equals " + s12 + " --> " + s10.equals(s12));

        /* the == operator compares the memory addresses of the two string objects.

            If two string objects are created using the same literal,
            they will have the same memory address and the == operator
            will return true when used to compare them.*/
        System.out.println(s10 + " = = " + s12 + " --> " + (s10==s12));

        /* .compareTo() --> The compareTo() method compares the current object with the
        specified object and returns an integer value.
        The returned value can have three possible results:

        A negative integer, if the current object is less than the specified object.
        Zero, if the current object is equal to the specified object.
        A positive integer, if the current object is greater than the specified object.

        */
        System.out.println(s10 + ".compareTo" + s12 + " --> " + s10.compareTo(s12));
        System.out.println(s10 + ".compareTo" + s13 + " --> " + s10.compareTo(s13));
        System.out.println(s13 + ".compareTo" + s10 + " --> " + s13.compareTo(s10));  //a-A --> 97 - 65 = 32
        System.out.println(s13 + ".compareTo" + s14 + " --> " + s13.compareTo(s14));

        //https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html --> ASCII TABLE


        //indexOf
        System.out.println(s10 + " index of A " + s10.indexOf("A")); //returns the index of first occurrence of A
        System.out.println(s10 + " index of a " +s10.indexOf("a"));  //returns the index of first occurrence of a

        //lastIndexOf
        System.out.println(s10 + " last index of a " +s10.lastIndexOf("a"));  //returns the index of last occurrence of a

        //indexOf(String str, int fromIndex) -->Returns the index of the given string starting from given index.
        String country = "Argentina";
        System.out.println("Index of n from 5 of " + country + " is " +  country.indexOf("n",5));

    }

}
