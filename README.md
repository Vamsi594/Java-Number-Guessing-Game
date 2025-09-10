A simple console-based number guessing game implemented in Java.  
The program randomly generates a number between 1 and 10, and the player has 3 attempts to guess it.  
After each game round, the user can choose to continue or exit.

📌 Features

- Random number generation between **1 and 10**.
- Player has **3 attempts** to guess correctly.
- Hints provided:
  - `"Greater Than"` → if the guess is higher than the number.
  - `"Less Than"` → if the guess is lower than the number.
- `"Tie"` message shown if the player guesses correctly.
- Option to **play again or exit**.

🏗️ Project Structure

- `GuessRandomNumber` → Main class that runs the game.
- `Random()` → Helper method to generate random numbers.

 🖥️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/JavaNumberGuessingGame.git

Sample Output

=== Guess Random Number ===
Enter the Number
5
Greater Than
Enter the Number
2
Less Than
Enter the Number
3
Tie
Continue the Process or not 
select the two strings yes/no
yes
