import java.util.Random;
import java.util.Scanner;

public class Hangman {

    //Choose from a bank of words
    public static String getWord() {

        String[] word = {"dogs", "cat"};

        return word[new Random().nextInt(word.length)];

    }//End getWord

    //Gets user input
    public static String getInput() {

        String fourLines = "\n\n\n\n";

        //Used in the while loop
        boolean notGood = true;

        //Stores input from user
        String letter = "";

        //Get user input for letter
        Scanner input = new Scanner(System.in);

        while (notGood) {

            System.out.print("Guess a letter." + fourLines);

            try {

                letter = input.next();
                if (letter.length() == 1) notGood = false;

            } catch (Exception ignored) {

            }
        }//end while

        return letter.toLowerCase();

    }//End getInput

    //Checks if letter is correct & assign
    public static void checkLetter(String letter, String word, StringBuilder correct, StringBuilder incorrect) {

        String correctWord = correct.toString();
        String incorrectWord = incorrect.toString();

        if (word.contains(letter)) {

            if (!correctWord.contains(letter)) {
                correct.deleteCharAt(word.indexOf(letter));
                correct.insert(word.indexOf(letter), letter);
            }

        } else {

            if (!incorrectWord.contains(letter)) {
                incorrect.append(letter);
            }

        }

    }

    public static void printOut(StringBuilder correctLetters, StringBuilder incorrectLetters) {

        String word = getWord();

        //Length of hidden word
        int charCount = word.length();

        //Creates blank spaces for guesser
        while (charCount > 0) {
            correctLetters.append("_");
            charCount--;
        }

        //Spaces between print outs
        String twoLines = "\n\n";
        String fourLines = "\n\n\n\n";

        String head = "O";
        String body = "|";
        String legs = "|";
        String blank = "    ";


        do {
            //Game title
            System.out.print(fourLines + "H A N G M A N" + twoLines);

            System.out.print("+---+" + twoLines);

            if (incorrectLetters.length() > 0) System.out.print(head + "   " + "|" + twoLines);
            else System.out.print(blank + "|" + twoLines);

            if (incorrectLetters.length() > 1) System.out.print(body + "   " + "|" + twoLines);
            else System.out.print(blank + "|" + twoLines);

            if (incorrectLetters.length() > 2) System.out.print(legs + "   " + "|" + twoLines);
            else System.out.print(blank + "|" + twoLines);

            System.out.print("   " + "===" + twoLines);

            System.out.println("Missed letters: " + incorrectLetters + twoLines);
            System.out.println("correct: " + correctLetters + twoLines);

            //Exits the program when maximum number of incorrect tries are reached
            if (incorrectLetters.length() == 3) {
                System.out.print("Sorry, but you lose.");
                System.exit(0);
            }

            //Exits the program when the correct work is made
            if (correctLetters.substring(0, correctLetters.length()).compareToIgnoreCase(word) == 0) {
                System.out.print("You win!!!!");
                System.exit(0);
            }

            //Get input and checks weather the letter works
            checkLetter(getInput(), word, correctLetters, incorrectLetters);

        } while ((incorrectLetters.length() <= 3));

    }

    //Main
    public static void main(String[] args) {
        //String holder
        StringBuilder incorrectLetters = new StringBuilder();
        StringBuilder correctLetters = new StringBuilder();

        printOut(correctLetters, incorrectLetters);

    }//End Main

}//End Class
