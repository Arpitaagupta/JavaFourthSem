package March21;

class Singleton {
    //Static variable reference of single_instance of type Singleton

    private static Singleton single_instance = null;

    //Declaring a variable of type String
    public String s;
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }

    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}

class SingletonDemo {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        System.out.println("HashCode of x is " +x.hashCode());
        System.out.println("HashCode of y is " +y.hashCode());
        System.out.println("HashCode of z is " +z.hashCode());
    }

}
