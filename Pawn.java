import java.util.*;

public class Pawn extends Piece{

	public List<Coordinate> posmoves = new ArrayList<Coordinate>();

	public Pawn(int owner, Coordinate z){
		super(owner, z);
	}

	public List<Coordinate> allMoves(){
		int currx = retx();
		int curry = rety();
		if (owner == 0){
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

	public static void main(String[] args){
		Coordinate test = new Coordinate(1,1);
		Pawn night = new Pawn(0, test);
		for (Coordinate thing: night.allMoves()){
			System.out.println(thing.toString());
		}
	}
}