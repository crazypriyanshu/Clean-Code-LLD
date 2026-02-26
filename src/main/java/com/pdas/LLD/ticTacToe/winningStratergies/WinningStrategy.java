package com.pdas.LLD.ticTacToe.winningStratergies;

import com.pdas.LLD.ticTacToe.Board;
import com.pdas.LLD.ticTacToe.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Player player);
}
