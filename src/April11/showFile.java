package April11;
import java.io.*;

import java.io.FileInputStream;

public class showFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        //First confirm that file name has been specified.

        if(args.length !=1){
            System.out.println("Usage ShowFile filename");
        return;}
        try { fin = new FileInputStream(args[0]);
    }
        catch (FileNotFoundException e){
            System.out.println("Cannot Open File");
            return;
        }
        try {
            do {
                i = fin.read();
                if (i == fin.read());
                if (i != -1)
                    System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e){
            System.out.println("Error Reading File");
            }

        // Close the file.
        try{
        fin.close();
        } catch (IOException e)
        {
            System.out.println("Error Closing File");
        }
        }
    }
