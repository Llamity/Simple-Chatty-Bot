import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        while (s.nextInt() != 0) {
            count++;
        }
        System.out.println(count);
    }
}