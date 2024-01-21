import java.util.Random;
import java.util.Scanner;

class Game {
    private int randomNumber;
    private int numGuesses;
    public int getNumGuesses() {
        return this.numGuesses;
    }

    public void setNumGuesses(int n) {
        this.numGuesses = n;
    }
    public Game(int upperLimit) {
        Random rand = new Random();
        this.randomNumber = rand.nextInt(upperLimit) + 1;
        this.numGuesses = 0;
    }

    public void takeUserInput(int num) {
        this.numGuesses++;
        if (num < this.randomNumber) {
            System.out.println("Your number is smaller than the generated number.");
        } else if (num > this.randomNumber) {
            System.out.println("Your number is greater than the generated number.");
        }
    }

    public boolean isCorrectNumber(int num) {
        return num == this.randomNumber;
    }
}

public class guessTheNumber {
    public static void main(String[] args) {
        String name;
        int upperLimit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Hi, " + name + "!");
        System.out.println("Select the difficulty level: ");
        System.out.println("1. Easy (1-20)");
        System.out.println("2. Medium (1-30)");
        System.out.println("3. Hard (1-50)");
        int difficulty = sc.nextInt();
        switch (difficulty) {
            case 1:
                upperLimit = 20;
                break;
            case 2:
                upperLimit = 30;
                break;
            case 3:
                upperLimit = 50;
                break;
            default:
                upperLimit = 20;
        }

        Game game = new Game(upperLimit);
        int guess;
        do {
            System.out.print("Guess a number between 1 and " + upperLimit + ": ");
            guess = sc.nextInt();
            game.takeUserInput(guess);
        } while (!game.isCorrectNumber(guess));

        System.out.println("Congratulations, you guessed the number!");
        System.out.println("Number of guesses: " + game.getNumGuesses());



        if (game.getNumGuesses() == 1) {
            System.out.println("Perfect guess!");
        } else if (game.getNumGuesses() > 1 && game.getNumGuesses() <= 5) {
            System.out.println("Your guess is good.");
        } else {
            System.out.println("Your guess is not good.");
        }
    }
}
