package com.pdas.LLD.ticTacToe.interfaces;


import com.pdas.LLD.ticTacToe.Game;
import com.pdas.LLD.ticTacToe.Player;

public interface GameState {
    void handleMove(Game game, Player player, int row, int col);
}
