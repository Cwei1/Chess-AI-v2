import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.*;

public class NullPiece extends Piece{
	public NullPiece(int owner, Coordinate z){
		super(owner, z);
	}

	public String toString(){
		return "N";
	}

	public ImageIcon getImage(){
		ImageIcon icon = new ImageIcon("Pics/null.png", "Test");
		return icon;
	}
}