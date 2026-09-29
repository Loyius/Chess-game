package org.example.chess;

import org.example.boardgame.Board;
import org.example.boardgame.Piece;

public class ChessPiece extends Piece {
    private Colour colour;

    public ChessPiece(Board board, Colour colour) {
        super(board);
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }
}
