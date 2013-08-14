package designpatterns.composite;

import java.util.Enumeration;

public class TreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode treeNode = new TreeNode("b");
		TreeNode treeNode2 = new TreeNode("c");
		TreeNode treeNode3 = new TreeNode("d");
		TreeNode treeNode4 = new TreeNode("e");
		treeNode2.add(treeNode3);
		treeNode2.add(treeNode4);
		treeNode.add(treeNode2);
		tree.root.add(treeNode);
		System.out.println("build the tree finished");
		System.out.println(tree.root.getName());
		getNode(tree.root);
	}
	static String str = "";
	static int i = 1;
	public static void getNode(TreeNode node){
		
		if(node != null){
			
			Enumeration<TreeNode> es = node.getChildren();
			int j =1;
			if (es.hasMoreElements()) {
				for(;j<=2*i-1;j++){
					
					str +="-";
				}
			}
			i++;
			/*
			 * |-b			0
			 * --|-c		2
			 * ----|-d		4
			 * ----|-c		4
			 */
			while(es.hasMoreElements()){
				TreeNode t = es.nextElement();
				System.out.println(str+"|-"+t.getName());
				getNode(t);
			}
		}
	}

}
