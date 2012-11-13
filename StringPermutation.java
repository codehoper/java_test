package com.ub.sol;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

	//	abc =
	//	acb
	//	bac =
	//	cab =
	//	bca
	//	cba =

	private void do_swap(StringBuffer str,int c,int d) {

		char temp = str.charAt(d);
		str.replace(d, d+1, Character.toString(str.charAt(c))) ;
		str.replace(c, c+1, Character.toString(temp)) ;
	}

	private  static void swap(StringBuffer str, int pos1, int pos2){
		char t1 = str.charAt(pos1);
		str.setCharAt(pos1, str.charAt(pos2));
		str.setCharAt(pos2, t1);
	} 



	private List<String> permutateString(String s) {
		List<String> strList = new ArrayList<String>();

		if(s.length() == 1) {
			//Base case
			strList.add(s);
			return strList;
		}else {
			// separate the first character from the rest
			char first = s.charAt(0);
			String rest = s.substring(1);
			// get all permutationsOf the rest of the characters
			List<String> simpler = permutateString(rest); // recursive step

			// for each permutation,
			for (String permutation : simpler) { // extra work
				// add the first character in all possible positions, and
				List<String> additions = insertAtAllPositions(first, permutation);
				// put each result into a new ArrayList
				strList.addAll(additions);
			}

		}
		return strList;


	}

	private List<String> insertAtAllPositions(char first, String s) {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<String>();
		for (int i = 0; i <= s.length(); i++) {
			String inserted = s.substring(0, i) + first + s.substring(i);
			result.add(inserted);
		}
		
		return result;
	}

	/**
	 * Use recursion.
	1.Try each of the letters in turn as the first letter and
	 then find all the permutations of the remaining letters using a recursive call.
	2.The base case is when the input is an empty string
	 the only permutation is the empty string.

	 * @param str
	 * @param index
	 * @param strList
	 */
	private void recPermutation(StringBuffer str,int index,List<String> strList) {

		if(index == 0) {
			strList.add(str.toString());
		} else {
			recPermutation(str, index -1, strList);  //traverse
			int currPos = str.length()-index;
			for (int i = currPos+1; i < str.length(); i++) {//start swapping all other chars with current first char
				swap(str,currPos, i);
				recPermutation(str, index-1,strList); //for saving in list
				swap(str,i, currPos);//restore back my string buffer
			}

		}
	}

	private void recPermute(StringBuffer str,int index,List<String> strList) {


		int len = str.length();
		if(index == len) { // base case ????????????
			//			System.out.println("size "+strList.size());
		}else {

			//			index = index +1;
			for(int i = index;i<len;i++) {
				//				System.out.println(" "+i);
				do_swap(str,i,index);
				strList.add(str.toString());
				do_swap(str,i,index);
			}
			recPermute(str, index + 1, strList);

		}

	}

	public static void main(String args[]){

		StringPermutation strPer = new StringPermutation();
		List<String> strList = new ArrayList<String>();
		//		strPer.recPermute(new StringBuffer("abc"),0,strList);
//		StringBuffer strBuffer = new StringBuffer("abc");
//		strPer.recPermutation(strBuffer,strBuffer.length(),strList);
//		System.out.println("size "+strList.size());
//		for(String s:strList){
//			System.out.println(s);
//		}
		
		List<String> strResultList = strPer.permutateString("abc");
		
		for(String str:strResultList) {
			System.out.println(str);
		}
	}
}
