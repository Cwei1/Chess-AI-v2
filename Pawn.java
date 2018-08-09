import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Pawn extends Piece{

	public List<Coordinate> posmoves;
	public int Owner;

	public Pawn(int owner, Coordinate z){
		super(owner, z);
		Owner = owner;
	}

	public List<Coordinate> allMoves(){
		posmoves = new ArrayList<Coordinate>();
		int currx = retx();
		int curry = rety();
		if (Owner == 0){
			if (curry == 1){
				posmoves.add(new Coordinate(currx, curry + 1));
				posmoves.add(new Coordinate(currx, curry + 2));
			}
			else{
				posmoves.add(new Coordinate(currx, curry + 1));
			}
		}
		else{
			if (curry == 6){
				posmoves.add(new Coordinate(currx, curry - 1));
				posmoves.add(new Coordinate(currx, curry - 2));
			}
			else{
				posmoves.add(new Coordinate(currx, curry - 1));
			}
		}
		return posmoves;
	}

	public String toString(){
		return "P";
	}

	public int retOwner(){
		return Owner;
	}

	public ImageIcon getImage(){
		ImageIcon icon;
		if (retOwner() == 0){
			icon = new ImageIcon("Pics/wpawn.png", "Test");
		}
		else{
			icon = new ImageIcon("Pics/bpawn.png", "Test");
		}
		return icon;
	}

	public static void main(String[] args){
		Coordinate test = new Coordinate(1,1);
		Pawn night = new Pawn(0, test);
		for (Coordinate thing: night.allMoves()){
			System.out.println(thing.toString());
		}
	}
}