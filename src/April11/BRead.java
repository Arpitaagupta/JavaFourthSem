package April11;
import java.io.*;

public class BRead {
    public static void main(String[] args) throws IOException{
        char c;
        int x;
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'Q' to quit");
        do{
            c=(char)br.read();
            //x=br.read();
            System.out.println(c);
        }
        while (c!='Q');

    }
}
