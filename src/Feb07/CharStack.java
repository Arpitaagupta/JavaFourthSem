package Feb07;
import java.util.Arrays;

public class CharStack {
    //Instance variables
    private char[] stackArray; //The array implementing  the stack.
    private int topOfStack; //The top of the stack.
    //Stack Variable
    private static int counter; //(1)
    //Constructor now increments the counter for each object created.
    public CharStack(int capacity)
    { //2
      stackArray = new char[capacity];
      topOfStack = -1;
      counter++;
    }

    //Instance Methods :
    public void push(char element)
    {
        stackArray[++topOfStack] = element;

    }
}
