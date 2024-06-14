# CS24011 Lab 1: Reversi - Minimax with Alpha-Beta Pruning Implementation

**Authors:** Ian Pratt-Hartmann & Francisco Lobo
**Academic Session:** 2022-23
**Git Tag:** 24011-lab1-S-Games

## Introduction

This Markdown file provides an overview of the Java program `MoveChooser.java`, designed to enhance the computer player's strategy in the game of Reversi (Othello) using the Minimax algorithm with Alpha-Beta pruning. The code builds upon the existing game logic provided in the `BoardState` class and the basic graphical user interface (GUI).

## Key Improvements

*   **Minimax Algorithm:**  The core enhancement lies in the implementation of the Minimax algorithm within the `chooseMove` function. This algorithm recursively explores the game tree, simulating potential moves for both players to determine the optimal move for the computer (white player).
*   **Alpha-Beta Pruning:**  To optimize the search process, the code incorporates Alpha-Beta pruning. This technique eliminates unnecessary branches of the game tree by maintaining lower (alpha) and upper (beta) bounds on the possible outcomes, significantly reducing the number of positions evaluated.
*   **Static Evaluation Function:** The code utilizes a predefined static evaluation function (`staticEval`) to assess the favorability of a given board state. This function assigns weights to individual squares based on their strategic value, considering factors like edges, corners, and mobility.
*   **Depth-Limited Search:** The search depth for the Minimax algorithm is controlled by the `searchDepth` variable, limiting the number of moves ahead the computer considers. This allows for adjustable complexity and response time.

## Code Structure

*   **`chooseMove(BoardState boardState)`:** This function is the entry point for the computer player's move selection. It initiates the Minimax search with Alpha-Beta pruning and returns the optimal move found.
*   **`miniMaxAB(int depth, int alpha, int beta, BoardState boardState)`:** This recursive function implements the Minimax algorithm. It explores the game tree to the specified `depth`, maximizing the score for the computer and minimizing it for the opponent.
*   **`staticEval(BoardState boardState)`:** This function evaluates a given board state based on the weighted sum of occupied squares.

## Usage

1.  **Compile:** Compile the modified `MoveChooser.java` along with the other project files using `javac Othello.java`.
2.  **Run:** Execute the program with `java Othello`.
3.  **Play:** The human player (black) can interact with the GUI to make moves, and the computer (white) will use the enhanced `MoveChooser` to determine its responses.

## Key Functionalities

*   **`miniMaxAB` Implementation:** The `miniMaxAB` function effectively implements the Minimax algorithm with Alpha-Beta pruning to evaluate and select optimal moves for the computer player.
*   **Static Evaluation:** The `staticEval` function provides a reasonable estimation of board positions' value based on weighted square values.

## Additional Notes

*   The code includes error handling to account for cases where no legal moves are available, ensuring smooth gameplay.
*   The `valueOfSquare` array stores the predefined weights for each square, contributing to the static evaluation function.
*   The provided code appears to be well-structured and readable, facilitating understanding and potential modifications.

## Potential Improvements

*   **Enhanced Static Evaluation:** The static evaluation function could be further refined to consider additional factors like piece stability, potential for future moves, and control of key areas.
*   **Iterative Deepening:** Implementing iterative deepening would allow the search depth to be dynamically adjusted based on available time, potentially leading to better move choices in time-constrained situations.
*   **Opening/Ending Book:** Incorporating an opening book or endgame tablebase could significantly improve the computer's performance in the early and late stages of the game.

Feel free to explore and experiment with these potential enhancements to further improve the Reversi AI's capabilities.
