package org.example.chess;

import org.example.boardgame.Board;
import org.example.boardgame.Piece;
import org.example.boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Colour colour;
    private int moveCount;

    public ChessPiece(Board board, Colour colour) {
        super(board);
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public int getMoveCount() {
        return moveCount;
    }

    protected void increaseMoveCount() {
        moveCount++;
    }

    protected void decreaseMoveCount() {
        moveCount--;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColour() != colour;
    }
}
