import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input;
        int total = 0;
        while ((input = s.nextInt()) != 0) {
            total += input;
            if (total >= 1000) {
                total -= 1000;
                break;
            }
        }
        System.out.println(total);
    }
}