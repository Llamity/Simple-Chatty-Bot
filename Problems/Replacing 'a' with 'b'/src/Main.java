// Posted from EduTools plugin
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letters = scanner.nextLine();

        System.out.println(letters.replace("a", "b"));
    }
}