import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 * @author Cagatay KARASU
 * @since 04.12.2020
 */

public class Cagatay_Karasu_Assignment2 {

    public static void main(String[] args) {

        String gamerName = showInputDialog(null, "Welcome to the game.\n" +
                "Enter your name please.\n" + "Type 0 for exit the game.", "## ROCK, PAPER, SCISSOR ##", INFORMATION_MESSAGE);

        if (gamerName.equals("0")) {
            showMessageDialog(null, "Thank you for joining the game.",
                    "## ROCK, PAPER, SCISSOR ##", INFORMATION_MESSAGE);
        }
        else
            game(gamerName);
    }

    public static void game(String name) {

        int myScore = 0;
        int compScore = 0;
        int round = 1;

        showMessageDialog(null, "Hi " + name + "\nRule of Game : The first player who reaches 5 points wins.",
                "Let's Start!", INFORMATION_MESSAGE);

        while (compScore !=5 && myScore !=5) {

            String myChoice = showInputDialog(null, "Your Score = " + compScore +
                    " - My Score = " + myScore + "\nRock, Scissor or Paper?", "Round : " + round, INFORMATION_MESSAGE);

            myChoice = myChoice.toLowerCase();

            if (!myChoice.equals("rock") && !myChoice.equals("scissor") && !myChoice.equals("paper")) {
                showMessageDialog(null, "Wrong move!", "ERROR!", WARNING_MESSAGE);
            }

            int randNumber = (int) (Math.random() * 3);
            String compChoice = compChoice(randNumber);

            if (myChoice.equals("rock")) {

                if (compChoice.equals("rock")) {
                    showMessageDialog(null, "My answer is rock. Your answer is rock too .It's a tie!", "Message", INFORMATION_MESSAGE);
                    round++;
                }
                else if (compChoice.equals("scissor")) {
                    showMessageDialog(null, "My answer is rock. Rock breaks scissors. You lose!", "Message", INFORMATION_MESSAGE);
                    myScore++;
                    round++;
                }
                else if (compChoice.equals("paper")) {
                    showMessageDialog(null, "My answer is rock. Paper eats rock. You win!", "Message", INFORMATION_MESSAGE);
                    compScore++;
                    round++;
                }
            }

            else if (myChoice.equals("paper")) {
                if (compChoice.equals("rock")) {
                    showMessageDialog(null, "My answer is paper. Paper eats rock. You lose!", "Message", INFORMATION_MESSAGE);
                    myScore++;
                    round++;
                }
                else if (compChoice.equals("scissor")) {
                    showMessageDialog(null, "My answer is paper. Scissor cuts paper. You win!", "Message", INFORMATION_MESSAGE);
                    compScore++;
                    round++;
                }
                else if (compChoice.equals("paper")) {
                    showMessageDialog(null, "My answer is paper. Your answer is paper too .It's a tie!", "Message", INFORMATION_MESSAGE);
                    round++;
                }
            }

            else if (myChoice.equals("scissor")) {
                if (compChoice.equals("rock")) {
                    showMessageDialog(null, "My answer is scissor. Rock breaks scissor. You win!", "Message", INFORMATION_MESSAGE);
                    compScore++;
                    round++;
                }
                else if (compChoice.equals("scissor")) {
                    showMessageDialog(null, "My answer is scissor. Your answer is scissor too. It's a tie!", "Message", INFORMATION_MESSAGE);
                    round++;
                }
                else if (compChoice.equals("paper")) {
                    showMessageDialog(null, "My answer is scissor. Scissor cuts paper. You lose!", "Message", INFORMATION_MESSAGE);
                    myScore++;
                    round++;
                }
            }
        }

        if (myScore == 5) {
            showMessageDialog(null, "I Win!", "Message", INFORMATION_MESSAGE);
        }
        else {
            showMessageDialog(null, "Congrats! You Win!", "Message", INFORMATION_MESSAGE);
        }
    }

    public static String compChoice(int randNumber) {

        String compChoice = null;

        switch (randNumber) {
            case 0:
                compChoice = "rock";
                break;
            case 1:
                compChoice = "scissor";
                break;
            case 2:
                compChoice = "paper";
                break;
        }
        return compChoice;
    }
}