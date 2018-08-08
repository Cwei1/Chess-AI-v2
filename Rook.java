import java.util.*;

public class Rook extends Piece{

	public List<Coordinate> posmoves = new ArrayList<Coordinate>();

	public Rook(int owner, Coordinate z){
		super(owner, z);
	}

	public List<Coordinate> allMoves(){
		int currx = retx();
		int curry = rety();
		int tempx = currx;
		int tempy = curry;
	 	while (tempy < 7){
	 		posmoves.add(new Coordinate(tempx, tempy + 1));
	 		tempy++;
	 	}
	 	tempx = currx;
		tempy = curry;
	 	while (tempx > 0){
	 		posmoves.add(new Coordinate(tempx - 1, tempy));
	 		tempx--;
	 	}
	 	tempx = currx;
		tempy = curry;
	 	while (tempx < 7){
	 		posmoves.add(new Coordinate(tempx + 1, tempy));
	 		tempx++;
	 	}
	 	tempx = currx;
		tempy = curry;
	 	while (tempy > 0){
	 		posmoves.add(new Coordinate(tempx, tempy - 1));
	 		tempy--;
	 	}
		return posmoves;
	}

	public String toString(){
		return "R";
	}

	public static void main(String[] args){
		Coordinate test = new Coordinate(3,3);
		Rook night = new Rook(0, test);
		for (Coordinate thing: night.allMoves()){
			System.out.println(thing.toString());
		}
	}
}