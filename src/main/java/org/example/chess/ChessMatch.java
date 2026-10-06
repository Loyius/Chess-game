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

    private  void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column,row).toPosition());
    }

    private void initialSetup(){
        placeNewPiece('b',6,new Rook(board, Colour.WHITE));
        placeNewPiece('e',1, new King(board, Colour.BLACK));
    }
}
