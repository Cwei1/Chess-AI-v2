import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.*;

public class King extends Piece{

	public List<Coordinate> posmoves;;
	public int Owner;

	public King(int owner, Coordinate z){
		super(owner, z);
		Owner = owner;
	}

	public List<Coordinate> allMoves(){
		posmoves = new ArrayList<Coordinate>();
		int currx = retx();
		int curry = rety();
		posmoves.add(new Coordinate(currx+1, curry));
		posmoves.add(new Coordinate(currx, curry+1));
		posmoves.add(new Coordinate(currx-1, curry));
		posmoves.add(new Coordinate(currx, curry-1));
		posmoves.add(new Coordinate(currx+1, curry+1));
		posmoves.add(new Coordinate(currx-1, curry-1));
		posmoves.add(new Coordinate(currx-1, curry+1));
		posmoves.add(new Coordinate(currx+1, curry-1));
		return posmoves;
	}

	public String toString(){
		return "K";
	}

	public int retOwner(){
		return Owner;
	}

	public ImageIcon getImage(){
		ImageIcon icon;
		if (retOwner() == 0){
			icon = new ImageIcon("Pics/wking.png", "Test");
		}
		else{
			icon = new ImageIcon("Pics/bking.png", "Test");
		}
		return icon;
	}

	public static void main(String[] args){
		Coordinate test = new Coordinate(3,3);
		King night = new King(0, test);
		for (Coordinate thing: night.allMoves()){
			System.out.println(thing.toString());
		}
	}
}