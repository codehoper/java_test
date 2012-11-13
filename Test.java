package com.ub.interview;

import com.ub.interview.BSTDummy.TravesalType;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {



		//		Swap swap = new Swap();
		//		swap.swap(23, 57);
		//		swap.swapWithoutTemp(23, 57);
		//
		//		Anagram ang = new Anagram();
		//		ang.verifyAnagram("amleth", "hamlet");
		//		ang.verifyAnagram("Amleth", "Hamlet");
		
//		SecondLargest second = new SecondLargest(new int[]{ 1, 5, 2, -1, -20, 78, 34, 23, 88, 435, 43, 100, -200, 67, 91});
//		System.out.println("Second largest Number is:"+second.getSecondLargest());

//		getNumber(98);
		sllOperation();
					
	}
	
	public static void sllOperation() {
		SLL<String> sll = new SLL<String>();
		sll.addPayload("Sachin");
		sll.addPayload("Sehwag");
		sll.addPayload("Gauti");
		sll.addPayload("Gilly");
		sll.addPayload("Glean");
		System.out.println("The result " + sll.toString());
		
		Node<String> newHead= sll.reverseList(sll.head, sll.head.next);
		sll.head = newHead;
		System.out.println("The result " + sll.toString());
	}
	
	public static void bstOperation() {
//			BST<String> bst = new BST<String>();
//		bst.insertNode(bst.getRoot(), "DD");
//		bst.insertNode(bst.getRoot(), "CSK");
//		bst.insertNode(bst.getRoot(), "RCB");
//		bst.insertNode(bst.getRoot(), "MI");
//			BSTDummy bstDummy = new BSTDummy();
//			bstDummy.insertTreeNode(20);
//			bstDummy.insertTreeNode(10);
//			bstDummy.insertTreeNode(4);
//			bstDummy.insertTreeNode(2);
//			bstDummy.insertTreeNode(6);
//			bstDummy.insertTreeNode(12);
//			bstDummy.insertTreeNode(11);
//			bstDummy.insertTreeNode(34);
//			bstDummy.insertTreeNode(40);
////			bstDummy.deleteNode(34);
//			bstDummy.deleteNode(10);
//			System.out.println("::::Post order traversal:::::");
//			bstDummy.traverseBST(TravesalType.POST_ORDER);
//			System.out.println(":::::Pre order traversal:::::");
//			bstDummy.traverseBST(TravesalType.PRE_ORDER);
//			System.out.println("::In order traversal:::");
//			bstDummy.traverseBST(TravesalType.IN_ORDER);
				
	}


	public static void arrangeDate() {

		/**
		 * write a program to print the increasing order given the input :12/mar/2011..15/jan 1990,
		 * 12/april/1985,23/dec/1960,11/sept/2004 the output will be
		 */
		
//		1.Convert date in the format yyyy-dd-mm  i.e.12/april/1985 => 19851204
//		2.Use radix sort o(k*n)


	}
	public static void getNumber(int number) {
		/**
		 * 1.) There is a sequence where aphabets are written like this..
a,b,c,d,.......,x,y,z,aa,ab,ac........,az,ba,bb,bc,bd......bz,ca,cb.........cz........,aaa,aab,aac.....aaz,............zzz,aaaa...........zzzz..... and so on..
WAP to find out the string value at kth position.

like if k= 28 the string on 28 will be "ab".
		 */
		int division  = number/26;
		int mod = 0;
		if(division >= 1) {
			mod = number %26;
		}

		System.out.println("division :"+division +"\n mod "+mod);
	}



}
