import java.util.*;
import javax.swing.*;
import java.lang.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class GameBoard{

	public Piece[][] board;

	public GameBoard(){
		board = new Piece[8][8];
		for (int x = 0; x < 8; x++){
			for (int y = 0; y < 8; y++){
				NullPiece init = new NullPiece(2, new Coordinate(x,y));
				board[x][y] = init;
			}
		}
	}

	public Piece[][] retBoard(){
		return board;
	}

	public void initboard(){
		for (int x = 0; x < 8; x++){
			Pawn newPawn = new Pawn(0, new Coordinate(x, 1));
			Pawn newPawn2 = new Pawn(1, new Coordinate(x, 6)); 
			board[1][x] = newPawn;
			board[6][x] = newPawn2;
		}
		Rook newRook = new Rook(0, new Coordinate(0,0));
		Rook newRook2 = new Rook(0, new Coordinate(7,0));
		Knight newKnight = new Knight(0, new Coordinate(1, 0));
		Knight newKnight2 = new Knight(0, new Coordinate(6, 0));
		Bishop newBishop = new Bishop(0, new Coordinate(2, 0));
		Bishop newBishop2 = new Bishop(0, new Coordinate(5, 0));
		Queen newQueen = new Queen(0, new Coordinate(3, 0));
		King newKing = new King(0, new Coordinate(4, 0));

		board[0][0] = newRook;
		board[0][7] = newRook2;
		board[0][1] = newKnight;
		board[0][6] = newKnight2;
		board[0][2] = newBishop;
		board[0][5] = newBishop2;
		board[0][3] = newQueen;
		board[0][4] = newKing;

		Rook newRook3 = new Rook(1, new Coordinate(0,7));
		Rook newRook4 = new Rook(1, new Coordinate(7,7));
		Knight newKnight3 = new Knight(1, new Coordinate(1, 7));
		Knight newKnight4 = new Knight(1, new Coordinate(6, 7));
		Bishop newBishop3 = new Bishop(1, new Coordinate(2, 7));
		Bishop newBishop4 = new Bishop(1, new Coordinate(5, 7));
		Queen newQueen2 = new Queen(1, new Coordinate(4, 7));
		King newKing2 = new King(1, new Coordinate(3, 7));

		board[7][0] = newRook3;
		board[7][7] = newRook4;
		board[7][1] = newKnight3;
		board[7][6] = newKnight4;
		board[7][2] = newBishop3;
		board[7][5] = newBishop4;
		board[7][3] = newQueen2;
		board[7][4] = newKing2;
	}

	public static void main(String[] args){
		GameBoard newboard = new GameBoard();
		newboard.initboard();
		for (int i = 7; i >= 0; i--){
			System.out.println(Arrays.toString(newboard.retBoard()[i]));
		}
	}

}