import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = 1;
        for (int i = 1; t <= n; i++) {
            t = i * i;
            if (t <= n) {
                System.out.println(t);
            }
        }
    }
}
