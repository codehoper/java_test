package com.ub.interview;

import java.util.Arrays;

/**
 * 
 * 
 *
 *An alphagram of a word (or of any group of letters) consists of the word's letters arranged in alphabetical order. 
 *For example, the alphagram of alphagram is aaaghlmpr. 
 *Two words are anagrams of each other if and only if they have the same alphagram.
 */
public class Anagram {

	public Anagram() {

	}

	public boolean  verifyAnagram(String first,String second) {
		boolean isAnagram = false;
		if(first.length() == second.length()) {
			char [] caseChar1 = first.toCharArray();
			char [] caseChar2 = second.toCharArray();

			//Convert all charcters to lowercase ,here if we use iterator we might have to loop O(n^2) times
			for(int i=0;i<caseChar1.length;i++) {
				caseChar1[i] = Character.toLowerCase(caseChar1[i]);
				caseChar2[i] = Character.toLowerCase(caseChar2[i]);
			}

			//Sort elements to create alphagram
			Arrays.sort(caseChar1);
			Arrays.sort(caseChar2);

			if(Arrays.equals(caseChar1, caseChar2)) {
				isAnagram = true;
			}

		}

		return isAnagram;

	}

}
