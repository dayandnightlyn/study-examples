
public class Main {

	public static void main(String[] args) {
		Tree oakTree = new Tree(120, 12, TreeType.OAK);
		
		Tree mapleTree = new Tree(90, 30, TreeType.MAPLE);
		
		mapleTree.grow();
		oakTree.announceTallTree();
		mapleTree.announceTallTree();
		Tree.announceTree();
		
		System.out.println(oakTree.getTreeType());
		System.out.println(oakTree.getHeightFt());
		System.out.println(oakTree.getDiameterInch());
		
		
		oakTree.setHeightFt(150);
		oakTree.setDiameterInch(16);
		
		System.out.println(oakTree.getHeightFt());
		System.out.println(oakTree.getDiameterInch());
		
	}

}
