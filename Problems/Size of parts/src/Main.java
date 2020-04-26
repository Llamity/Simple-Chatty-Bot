// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int perfect = 0;
        int fix = 0;
        int eject = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a == 0) {
                perfect++;
            } else if (a == -1) {
                eject++;
            } else {
                fix++;
            }
        }
        System.out.println(perfect + " " + fix + " " + eject);
    }
}

