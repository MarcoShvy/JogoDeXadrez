package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Horse extends ChessPiece {

    public Horse(Board board, Color color) {
        super(board, color);
    }

    private boolean canMove(Position position) {
        ChessPiece p =(ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0,0);

        // 2 frente 1 direita
        p.setValues(position.getRow()-2, position.getColumn() +1);
        if(getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        // 2 frente 1 esquerda
        p.setValues(position.getRow()-2, position.getColumn() -1);
        if(getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        // 1 frente 2 direita
        p.setValues(position.getRow()-1, position.getColumn() +2);
        if(getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        // 1 frente 2 esquerda
        p.setValues(position.getRow() -1, position.getColumn() -2);
        if(getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        // 2 atras 1 direita
        p.setValues(position.getRow()+2, position.getColumn() +1);
        if(getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        // 2 atras 1 esquerda
        p.setValues(position.getRow()+2, position.getColumn() -1);
        if(getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        // 1 atras 2 direita
        p.setValues(position.getRow()+1, position.getColumn() +2);
        if(getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }
        // 1 atras 2 esquerda
        p.setValues(position.getRow() +1, position.getColumn() -2);
        if(getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }


    @Override
    public String toString() {
        return "H";
    }
}
