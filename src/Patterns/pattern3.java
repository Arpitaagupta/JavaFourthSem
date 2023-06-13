package Patterns;

public class pattern3 {
    public static void main(String ar[])
    {
        int x[][];
        x=new int[3][];
        x[0]=new int[1];
        x[1]=new int[2];
        x[2]=new int[3];


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(" "+1 );
            }
            System.out.println(" ");

        }

    }
}
