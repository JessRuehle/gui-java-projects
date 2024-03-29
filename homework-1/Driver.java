import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Welcome to Frogs and Toads.\n");
        Scanner in = new Scanner(System.in);
        FrogsAndToads2D game = new FrogsAndToads2D();
        System.out.println(game);

        while (game.canMove()) {
            System.out.print("Enter your move: ");
            int r = in.nextInt();
            int c = in.nextInt();
            System.out.println();
            game.move(r, c);
            System.out.println(game);
        }

        if (game.inWinningConfig()) {
            System.out.println("YOU WIN!");
        } else {
            System.out.println("YOU ARE STUCK!");
        }
    }
}
