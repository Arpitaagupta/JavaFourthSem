package March21;

public class getCharDemo {
    public static void main(String[] args) {
        String s = "Hello from Java World at java.lang.String.charAt";
        int start = 15;
        int end = 25;

        char buf[] = new char[end + start];
        s.getChars(start, end, buf, 0);  //buf--> to store starting from index 0
        System.out.println(buf);



    }
}
