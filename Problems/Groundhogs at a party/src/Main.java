import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean party;

        party = weekend && (cups >= 15 && cups <= 25) || !weekend && (cups >= 10 && cups <= 20);
        System.out.println(party);
    }
}