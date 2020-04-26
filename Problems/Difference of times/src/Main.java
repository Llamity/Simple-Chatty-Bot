// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startTime = scanner.nextInt() * 3600 + scanner.nextInt() * 60 + scanner.nextInt();
        int endTime = scanner.nextInt() * 3600 + scanner.nextInt() * 60 + scanner.nextInt();

        System.out.println(endTime - startTime);

    }
}