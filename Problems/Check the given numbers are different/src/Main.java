// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        int no3 = scanner.nextInt();

        System.out.println(no1 != no2 && no1 != no3 && no2 != no3);
    }
}