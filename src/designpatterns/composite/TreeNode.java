package designpatterns.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {
	//�ڵ���
	private String name; 
	//���ڵ�
	private TreeNode parent;
	//�ӽڵ�
	private Vector<TreeNode> children = new Vector<TreeNode>();
	
	public TreeNode(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	
	public void add(TreeNode treeNode){
		this.children.add(treeNode);
	}
	
	public void remove(TreeNode treeNode){
		this.children.remove(treeNode);
	}
	
	public Enumeration<TreeNode> getChildren(){
		return this.children.elements();
	}
}
