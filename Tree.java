import java.awt.Color;

public class Tree {
	double heightFt;
	double diameterInch;
	TreeType treeType;
	static Color TRUNK_COLOR = new Color(102, 51, 0);
	
	Tree(double heightFt, double diameterInch, TreeType treeType) {
		this.heightFt = heightFt;
		this.diameterInch = diameterInch;
		this.treeType = treeType;
	}
	
	void grow() {
		this.heightFt = this.heightFt + 10;
		this.diameterInch = this.diameterInch + 1;
	}

	void announceTallTree() {
		if(this.heightFt > 100) {
			System.out.println("That's a tall " + this.treeType + " tree.");
		}
		
	}
}
