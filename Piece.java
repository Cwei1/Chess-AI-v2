import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;

public class Piece implements Cloneable, Serializable{
	int owner;
	Coordinate location;
	ImageIcon icon;

	public Piece(int whoowns, Coordinate z){
		owner = whoowns;
		location = z;
	}

	public int retOwner(){
		return owner;
	}

	public int retx(){
		return location.xcord();
	}

	public int rety(){
		return location.ycord();
	}

	public ImageIcon getImage(){
		return icon;
	}
}