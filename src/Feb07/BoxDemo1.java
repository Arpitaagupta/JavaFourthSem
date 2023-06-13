package Feb07;

class Box2{
   private double w,h,d;

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getD(){
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
}


public class BoxDemo1 {
    private double w,h,d;
    public static void main(String[] args) {
        Box2 b1 = new Box2();
        b1.setW(12.0);
        b1.setH(10.0);
        b1.setD(21.9);

        double vol;
        vol = b1.getW() * b1.getH() * b1.getD();

        System.out.println("Value in double d = " +b1.getD());
        System.out.println("Value in double h = " +b1.getH());
        System.out.println("Value in double w = " +b1.getW());
        System.out.println("Volume = " +vol);
    }
}
