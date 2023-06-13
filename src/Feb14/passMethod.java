package Feb14;

public class passMethod {
    int x,y;
    passMethod(int a, int b){
        x=a;
        y=b;
    }

    passMethod(){
        x=1;
        y=1;
    }

    boolean test(passMethod p){
        if(p.x==x && p.y==y)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        passMethod p1 = new passMethod(2,4);
        passMethod p2 = new passMethod(2,4);
        passMethod p3 = new passMethod();


        System.out.println("p1.x " +p1.x);
        System.out.println("p1.y "+p1.y);
        System.out.println("p2.x " +p2.x);
        System.out.println("p2.y "+p2.y);
        System.out.println("p3.x " +p3.x);
        System.out.println("p3.y "+p3.y);

        System.out.println("Object p1 == p2 --> " +p1.test(p2));
        System.out.println("Object p1 == p3 --> " +p1.test(p3));

    }
}
