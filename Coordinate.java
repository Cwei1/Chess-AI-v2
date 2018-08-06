public class Coordinate{

	int xval;
	int yval;

	public Coordinate(int x, int y){
		xval = x;
		yval = y;
	}

	public int xcord(){
		return xval;
	}

	public int ycord(){
		return yval;
	}

	public String toString(){
		return "["+xval+","+yval+"]";
	}
}