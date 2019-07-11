import java.util.Scanner;

public class ChristmasDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            int c = 0;
            for (int i = 0; i < input.length(); i++) {
                char a = input.charAt(i);
                c += (int)a;
            }
            if (budget > c) {
                budget -= c;
                System.out.println("Item successfully purchased!");
            } else {
                System.out.println("Not enough money!");
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Stop")) {
            System.out.printf("Money left: %d", budget);
        }
    }
}
