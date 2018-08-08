import java.util.*;

public class Knight extends Piece{

	public List<Coordinate> posmoves = new ArrayList<Coordinate>();

	public Knight(int owner, Coordinate z){
		super(owner, z);
	}

	public List<Coordinate> allMoves(){
		int currx = retx();
		int curry = rety();
		posmoves.add(new Coordinate(currx + 2, curry + 1));
		posmoves.add(new Coordinate(currx + 2, curry - 1));
		posmoves.add(new Coordinate(currx + 1, curry + 2));
		posmoves.add(new Coordinate(currx + 1, curry - 2));
		posmoves.add(new Coordinate(currx - 2, curry + 1));
		posmoves.add(new Coordinate(currx - 2, curry - 1));
		posmoves.add(new Coordinate(currx - 1, curry + 2));
		posmoves.add(new Coordinate(currx - 1, curry - 2));
		return posmoves;
	}

	public String toString(){
		return "O";
	}

	public static void main(String[] args){
		Coordinate test = new Coordinate(1,1);
		Knight night = new Knight(1, test);
		for (Coordinate thing: night.allMoves()){
			System.out.println(thing.toString());
		}
	}
}