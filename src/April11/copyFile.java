package April11;
import java.io.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        //First confirm that both the files have been specified.
        if(args.length !=2)
        {
            System.out.println("Usage: CopyFile from to");
            return;
        }
        //Copy a file
        try {
            //attempt to open the files
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            }
            while (i != -1);
        } catch (IOException e){
            System.out.println("I/O Error : " + e);

        } finally {
            try{
                if (fin != null) fin.close();
            } catch (IOException e2){
                System.out.println("Error Closing Input File");
            }

            try{
                if(fout != null)fout.close();
            }catch (IOException e2){
                System.out.println("Error Closing Output File");
            }
        }
    }
}
