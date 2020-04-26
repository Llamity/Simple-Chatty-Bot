// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int sleep = scanner.nextInt();

        if (sleep < min) {
            System.out.print("Deficiency");
        }   else if (sleep > max) {
            System.out.print("Excess");
        }   else {
                System.out.println("Normal");
        }
    }
}