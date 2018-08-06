import java.util.*;

public class King extends Piece{

	public List<Coordinate> posmoves = new ArrayList<Coordinate>();

	public King(int owner, Coordinate z){
		super(owner, z);
	}

	public List<Coordinate> allMoves(){
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

	public static void main(String[] args){
		Coordinate test = new Coordinate(3,3);
		King night = new King(0, test);
		for (Coordinate thing: night.allMoves()){
			System.out.println(thing.toString());
		}
	}
}