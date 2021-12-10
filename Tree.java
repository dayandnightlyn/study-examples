import java.awt.Color;

public class Tree {
	private double heightFt;
	private double diameterInch;
	private TreeType treeType;
	protected static Color TRUNK_COLOR = new Color(102, 51, 0);
	
	public Tree(double heightFt, double diameterInch, TreeType treeType) {
		this.heightFt = heightFt;
		this.diameterInch = diameterInch;
		this.treeType = treeType;
	}
	
	public void grow() {
		this.heightFt = this.heightFt + 10;
		this.diameterInch = this.diameterInch + 1;
	}
	
	public double getHeightFt() {
		return heightFt;
	}
	
	public void setHeightFt(double heightFt) {
		this.heightFt = heightFt;
	}
	
	public double getDiameterInch() {
		return diameterInch;
	}
	
	public void setDiameterInch(double diameterInch) {
		this.diameterInch = diameterInch;
	}
	
	public TreeType getTreeType() {
		return treeType;
	}
	
	public static void announceTree() {
		System.out.println("Look at that " + TRUNK_COLOR + " tree!");
	}

	public void announceTallTree() {
		if(this.heightFt >= 100) {
			System.out.println("That's a tall " + this.treeType + " tree.");
		}
		
	}
}
