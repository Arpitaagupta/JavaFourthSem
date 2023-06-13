package Patterns;

public class pattern1 {

    public static void main(String ar[])
    {
        int x[][];
        x=new int[5][];
        x[0]=new int[1];
        x[1]=new int[2];
        x[2]=new int[3];
        x[3]=new int[4];
        x[4]=new int[5];

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(" "+j );
            }
            System.out.println(" ");

        }

    }

}
