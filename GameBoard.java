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

	public int[][] board;

	public GameBoard(){
		board = new int[8][8];
	}

	public int[][] retBoard(){
		return board;
	}

	public static void main(String[] args){
		GameBoard newboard = new GameBoard();
		for (int i = 0; i < 8; i++){
			System.out.println(Arrays.toString(newboard.retBoard()[i]));
		}
	}

}