import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Bishop extends Piece{

	public List<Coordinate> posmoves = new ArrayList<Coordinate>();
	public int Owner;

	public Bishop(int owner, Coordinate z){
		super(owner, z);
		Owner = owner;
	}

	public List<Coordinate> allMoves(){
		int currx = retx();
		int curry = rety();
		int tempx = currx;
		int tempy = curry;
	 	while (tempx < 7 && tempy < 7){
	 		posmoves.add(new Coordinate(tempx + 1, tempy + 1));
	 		tempx++;
	 		tempy++;
	 	}
	 	tempx = currx;
		tempy = curry;
	 	while (tempx > 0 && tempy < 7){
	 		posmoves.add(new Coordinate(tempx - 1, tempy + 1));
	 		tempx--;
	 		tempy++;
	 	}
	 	tempx = currx;
		tempy = curry;
	 	while (tempx < 7 && tempy > 0){
	 		posmoves.add(new Coordinate(tempx + 1, tempy - 1));
	 		tempx++;
	 		tempy--;
	 	}
	 	tempx = currx;
		tempy = curry;
	 	while (tempx > 0 && tempy > 0){
	 		posmoves.add(new Coordinate(tempx - 1, tempy - 1));
	 		tempx--;
	 		tempy--;
	 	}
		return posmoves;
	}

	public String toString(){
		return "B";
	}

	public int retOwner(){
		return Owner;
	}

	public ImageIcon getImage(){
		ImageIcon icon;
		if (retOwner() == 0){
			icon = new ImageIcon("Pics/wbishop.png", "Test");
		}
		else{
			icon = new ImageIcon("Pics/bbishop.png", "Test");
		}
		return icon;
	}

	public static void main(String[] args){
		Coordinate test = new Coordinate(3,3);
		Bishop night = new Bishop(0, test);
		for (Coordinate thing: night.allMoves()){
			System.out.println(thing.toString());
		}
	}
}