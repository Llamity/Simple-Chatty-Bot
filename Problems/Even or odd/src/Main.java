import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input;

        while ((input = s.nextInt()) != 0) {
            System.out.println(input % 2 == 0 ? "even" : "odd");
        }
    }
}