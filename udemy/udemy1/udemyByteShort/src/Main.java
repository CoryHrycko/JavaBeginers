

public class Main {

    public static void main(String[] args) {


        byte myB=127;
        short mysh=20_000;
        int myValue = 10_000;
        long myl =1_000_000_000;
        long v = (long) (50_000 +(10*(myB+mysh+myValue))) ;

        System.out.println(v);

    }
}
