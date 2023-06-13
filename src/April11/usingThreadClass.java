package April11;
class newThread1 extends Thread{
    static int count=0;
    String str;
    newThread1(String s){
        super(s);
        System.out.println("Child Thread "+this);
        count++;
        start();
    }
    public void run()
    {
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Child Thread: " +i);
                Thread.sleep(500);}}
            catch(InterruptedException e){
                System.out.println("Child Interrupted.");
                System.out.println("Exciting child thread.");
        }
    }
}

public class usingThreadClass {
    public static void main(String[] args) {

    }
}
