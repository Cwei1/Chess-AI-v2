import java.util.*;

public class Queen extends Piece{

	public List<Coordinate> posmoves = new ArrayList<Coordinate>();

	public Queen(int owner, Coordinate z){
		super(owner, z);
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
	 	tempx = currx;
		tempy = curry;
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

	public static void main(String[] args){
		Coordinate test = new Coordinate(3,3);
		Queen night = new Queen(0, test);
		for (Coordinate thing: night.allMoves()){
			System.out.println(thing.toString());
		}
	}
}