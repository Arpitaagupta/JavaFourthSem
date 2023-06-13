package Feb21;

class Balance {
    String str;
    double bal;

    Balance(String s, double d) {
        str = s;
        bal = d;
    }

    void show() {
        System.out.println(" Account holds is " +str + " and balance is " + bal);
    }
}

public class AccountGet {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];
        current[0] = new Balance("Aman Deep", 810370.78);
        current[1] = new Balance("Amaaaan Deep", 8370.78);
        current[2] = new Balance("Amaan Deep", 97870.78);

        for ( int i =0; i<3; i++)
        {
            current[i].show();
        }
    }
}


