package Patterns;

public class pattern5 {
    public static void main(String ar[])
    {
        int x[][];
        x=new int[3][];
        x[0]=new int[1];
        x[1]=new int[2];
        x[2]=new int[3];
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<i+1;j++)
            {
                System.out.print(" "+j );
            }
            System.out.println(" ");

        }

    }
}
