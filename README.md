# OthelIO - Minimax with Alpha-Beta Pruning Implementation

**Core AI Logic (MoveChooser.java) by:** Vansh Goenka
**Base Game API and Movement Logic by:** Ian Pratt-Hartmann & Francisco Lobo

## Introduction

This Markdown file provides an overview of the enhanced Reversi (Othello) game, where the core AI logic for the computer player is implemented in `MoveChooser.java` by Vansh Goenka. The base game API, including movement logic and board representation, was provided by professors Ian Pratt-Hartmann and Francisco Lobo. This enhancement focuses on improving the computer player's decision-making using the Minimax algorithm with Alpha-Beta pruning.

## Key Improvements by Vansh Goenka (MoveChooser.java)

*   **Minimax Algorithm:**  Implemented the Minimax algorithm to strategically explore the game tree and simulate potential moves for both players, ultimately determining the optimal move for the computer (white player).
*   **Alpha-Beta Pruning:** Integrated Alpha-Beta pruning to optimize the Minimax search process, discarding unnecessary branches and significantly reducing the evaluation time.
*   **Static Evaluation Function:** Developed a static evaluation function (`staticEval`) to assess the favorability of a given board state based on weighted square values, prioritizing strategic positions like edges and corners.
*   **Depth-Limited Search:** Incorporated depth-limited search, controlled by the `searchDepth` variable, to manage the complexity of the Minimax search and balance decision-making speed with accuracy.

## Provided Base Game API and Movement Logic

*   **`BoardState` Class:** Professors Pratt-Hartmann and Lobo provided the `BoardState` class, which encapsulates the game's state, including the board representation, current player, and methods for making and checking legal moves.
*   **Graphical User Interface (GUI):** A basic GUI was also provided to facilitate human-computer interaction and visualize the game board.

## Usage

1.  **Compile:** Compile the modified `MoveChooser.java` (by Vansh Goenka) along with the provided game files using `javac Othello.java`.
2.  **Run:** Execute the program with `java Othello`.
3.  **Play:** The human player (black) interacts with the GUI, while the computer (white), powered by the enhanced AI in `MoveChooser.java`, makes its moves.

## Key Functionalities (MoveChooser.java by Vansh Goenka)

*   **`chooseMove`:** The main entry point for the computer's decision-making, initiating the Minimax search with Alpha-Beta pruning.
*   **`miniMaxAB`:** The core implementation of the Minimax algorithm with Alpha-Beta pruning, recursively evaluating game states and maximizing the computer's potential score.
*   **`staticEval`:** The static evaluation function that assesses the strategic value of a given board state using weighted square values.

## Acknowledgements

*   This project builds upon the base game API and movement logic provided by professors Ian Pratt-Hartmann and Francisco Lobo.
*   The core AI logic in `MoveChooser.java` is the work of Vansh Goenka.

## Potential Improvements

*   **Enhanced Static Evaluation:** Explore more sophisticated evaluation heuristics considering factors like mobility, stability, and control of key areas.
*   **Iterative Deepening:** Implement iterative deepening to dynamically adjust the search depth based on available time, potentially leading to stronger moves in time-constrained situations.
*   **Opening/Ending Book:** Incorporate an opening book or endgame tablebase to enhance the computer's play in the early and late stages of the game.
