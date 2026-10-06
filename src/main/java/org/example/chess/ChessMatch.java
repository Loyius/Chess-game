package org.example.chess;

import org.example.boardgame.Board;
import org.example.boardgame.Position;
import org.example.chess.pieces.King;
import org.example.chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int row=0;row<board.getRows();row++){
            for(int col=0;col<board.getColumns();col++){
                mat[row][col] = (ChessPiece) board.piece(row, col);
            }
        }
        return mat;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board, Colour.WHITE), new Position(2,1));
        board.placePiece(new King(board, Colour.BLACK), new Position(0,4));
    }
}
