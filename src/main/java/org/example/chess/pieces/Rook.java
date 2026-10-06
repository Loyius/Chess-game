package org.example.chess.pieces;

import org.example.boardgame.Board;
import org.example.chess.ChessPiece;
import org.example.chess.Colour;

public class Rook extends ChessPiece {

    public Rook(Board board, Colour colour) {
        super(board, colour);
    }

    @Override
    public String toString() {
        return "R";
    }
}
