/**
 * Question 1 a.
 * Play a game of Rock, Paper, Scissors. Each round prompts you to make a choice between rock, paper or scissors.
 * The computer then makes a random choice from the three options.  
 * When either the player or computer have won three rounds the game ends.
 *
 * @author Andy Stevens
 * @version 1.01
 */

import java.util.Random;

public class RockPaperScissors
{
    /**
     * Question 1 b.
     * Create private instance fields.
     */
    private InputReader reader;
    private int yourScore;
    private int computerScore;
    private Random ran;

    /**
     * Question 1 c.
     * Constructor to initialise instance fields.
     */
    public RockPaperScissors()
    {
        reader = new InputReader();
        yourScore = 0;
        computerScore = 0;
        ran = new Random(1);
    }

    /**
     * Q1 d. 
     * Print two blank lines followed by a prompt asking for the users input
     * which will appear to be on the same line.
     */
    public void printPrompt()
    {
        System.out.print("\nEnter your choice, paper, rock or scissors >");
    }
    
    /**
     * Q1 e.
     * Returns users input as a String object removing whitespace
     * and in lowercase format making the input case insensitive.
     * @return userInput returns users input.
     */
    public String userChoice()
    {
        String userInput = reader.getInput().toLowerCase().trim();
        return userInput; 
    }
    
    /**
     * Q1 f.
     * Generates a random number bewteen 0 and 2 (3 for 0 based index)
     * Based on the random number the computer will choose either rock,
     * paper or scissors.
     * @return compChoice returns the computers choice of rock, paper or scissors
     */
    public String computerChoice()
    {
        int randomNumber = ran.nextInt(3);
        
        String compChoice = "";
        
        switch(randomNumber)
        {
           case 0:
            compChoice = "rock";
            break;
           case 1:
            compChoice = "paper";
            break;
           case 2:
            compChoice = "scissors";
            break;
        }
        return compChoice;
    }
    
    
    /**
     * Q1 g.
     * Evaluates users choice against computers choice and returns who won.
     * @param yourChoice represents users choice.
     * @param computerChoice represents computers choice.
     * @return String object declaring who won or a draw.
     */
    public String findWinner(String yourChoice, String computerChoice)
    {
        if(yourChoice.equals(computerChoice)){
            return "draw";
        }
        else if(yourChoice.equals("rock") && computerChoice.equals("scissors")){
            yourScore = yourScore + 1;
            return "you";
        }
        else if(yourChoice.equals("paper") && computerChoice.equals("rock")){
            yourScore = yourScore + 1;
            return "you";
        }
        else if(yourChoice.equals("scissors") && computerChoice.equals("paper")){
            yourScore = yourScore + 1;
            return "you";
        }
        else {
            computerScore = computerScore + 1;
            return "computer";
        }
    }
    
    /**
     * Q1 h.
     * Prompts user and computer to input a choice, shows the choices
     * made by user and computer.
     * Calls findWinner() method to determine who won, and displays who won the game.
     */
    public void playRound()
    {
        String userPlays = userChoice();
        printPrompt();
        String computerPlays = computerChoice();
        System.out.println(
                        "\nYou have chosen " 
                        + userPlays + 
                        " and the computer has chosen " 
                        + computerPlays
                        );
        String winner = findWinner(computerPlays, userPlays);
        switch(winner)
        {
            case "draw":
                System.out.println("This game is a draw");
            break;
            case "you":
                System.out.println("You are the winner");
            break;
            case "computer":
                System.out.println("The computer is the winner");
            break;
        }
        System.out.println("You have " + yourScore + " and the computer has " + computerScore);
    }
    
    /**
     * Q1 i.
     * Plays rounds until either the user or computer
     * have a score of 3.
     */
    public void playGame()
    {
        playRound();
            if(yourScore == 3)
            {
                System.out.println("The overall winner is you.");
            }
            else 
            {
                System.out.println("The overall winner is the computer.");
            }   
    }
}
