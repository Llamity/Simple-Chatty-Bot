// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean no1 = scanner.nextInt() > 0;
        boolean no2 = scanner.nextInt() > 0;
        boolean no3 = scanner.nextInt() > 0;
        boolean allValid = no1 && no2 && no3;
        System.out.println(no1 ^ no2 ^ no3 != allValid);
    }
}