import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int busHeight = sc.nextInt();
        int numOfBridges = sc.nextInt();
        int crash = 0;

        for ( int counter = 1; numOfBridges >= counter; counter++  ) {
            int bridgeHeight = sc.nextInt();
            if (bridgeHeight <= busHeight){
                if (crash == 0) {
                    crash = counter;
                }
            }
        }
        if (crash > 0) {
            System.out.println("Will crash on bridge " + crash);
        } else
            System.out.println("Will not crash");
    }
}