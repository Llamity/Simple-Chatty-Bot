// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine().replace(" ", "");
        String second = scanner.nextLine().replace(" ", "");

        System.out.println(first.trim().equals(second.trim()));
    }
}