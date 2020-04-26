// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDistance = scanner.nextInt();
        int dayDistance = scanner.nextInt();
        int nightDistance = scanner.nextInt();
        System.out.println((totalDistance - nightDistance - 1) / (dayDistance - nightDistance) + 1);
    }
}