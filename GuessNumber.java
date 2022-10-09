import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    int theNumber;
    static int max = 5780;

    Scanner sc = new Scanner(System.in);

    public GuessNumber() {
        Random rand = new Random();
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void play() {
        int move;
        move = sc.nextInt();
        while (true) {
            if (move > theNumber) {
                System.out.println("Your number is too big");
                 move = sc.nextInt();
            } else if (move < theNumber) {
                System.out.println("Your number is too small");
                 move = sc.nextInt();
            } else {
                System.out.println("Correct Number!");
                break;
            }
        }
    }

    public static void howBigIsTheNumber() {

    }

    public static void main(String[] args) {
        GuessNumber play = new GuessNumber();
        System.out.println("Welcome to my number game");
        System.out.println("The number is between 0 and "+max);
        System.out.println("Enter the number");
        play.play();
    }
}
