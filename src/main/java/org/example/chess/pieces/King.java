package org.example.chess.pieces;

import org.example.boardgame.Board;
import org.example.chess.ChessPiece;
import org.example.chess.Colour;

public class King extends ChessPiece {
    public King(Board board, Colour colour) {
        super(board, colour);
    }

    @Override
    public String toString() {
        return "K";
    }
}
