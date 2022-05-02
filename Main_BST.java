package com.greatlearning.nodes;

import java.util.Scanner;

import com.greatlearning.nodes.TreeNode.Node;

public class Main_BST {

	public static void main(String[] args) {

		Node root = null;
		root = TreeNode.insert(root, 40);
		root = TreeNode.insert(root, 20);
		root = TreeNode.insert(root, 60);
		root = TreeNode.insert(root, 10);
		root = TreeNode.insert(root, 30);
		root = TreeNode.insert(root, 50);
		root = TreeNode.insert(root, 70);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sum : ");
		int sum = sc.nextInt(); // reads Integer data
		System.out.print("Sum = " + sum);
		System.out.println("\n");
		TreeNode.findPair(root, sum);
		sc.close();
	}

}
