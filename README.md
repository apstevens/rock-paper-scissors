# Rock, Paper, Scissors Game

**Project Overview**

This project implements a console-based game of Rock, Paper, Scissors. The game allows a user to play multiple rounds against the computer until either the user or the computer wins three rounds. The project consists of two primary classes: **InputReader** and **RockPaperScissors**.

**Author**

Andy Stevens

**Version**

1.01

**Date**

07/11/2021 (RockPaperScissors)

**Class Descriptions**

**InputReader Class**
The **InputReader** class is responsible for reading text input from the terminal window.

**Fields**

**private Scanner reader**: A Scanner object to read user input.

**Constructor**

**public InputReader()**: Initializes the Scanner object to read from the standard input.

**Methods**

**public String getInput()**: Reads a line of text from the terminal and returns it as a String.

**RockPaperScissors Class**

The **RockPaperScissors** class contains the logic for playing the game of Rock, Paper, Scissors.

**Fields**

**private InputReader reader**: An InputReader object to read user input.

**private int yourScore**: The user's score.

**private int computerScore**: The computer's score.

**private Random ran**: A Random object to generate the computer's choices.

**Constructor**

**public RockPaperScissors()**: Initializes the instance fields.

**Methods**

**public void printPrompt()**: Prints a prompt for the user to enter their choice.

**public String userChoice()**: Reads and returns the user's choice, formatted to be case-insensitive and trimmed of whitespace.

**public String computerChoice()**: Generates and returns the computer's choice based on a random number.

**public String findWinner(String yourChoice, String computerChoice)**: Determines and returns the winner of the round, updating scores accordingly.

**public void playRound()**: Conducts a single round of the game, displaying the choices and the result of the round.

**public void playGame()**: Plays rounds until either the user or the computer wins three rounds, then declares the overall winner.

**Usage**

To play the game, create an instance of the RockPaperScissors class and call the playGame method. The game will prompt the user to enter their choice for each round and will display the results after each round.

```
public class Main {
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.playGame();
    }
}
```

This project demonstrates basic input handling, random number generation, and control flow in Java, providing a foundation for more complex console-based games.
 
