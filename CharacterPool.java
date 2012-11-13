package com.framehawk.roman;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * This Singleton class  defines Roman numbers.
 * @author Vikram
 *
 */
public class CharacterPool {

	private Map<Character,Integer> charMap;
	private Map<Character, Integer> charSortedMap;
	private static CharacterPool charPoolInstance = null;

	private CharacterPool() {
		populateCharMap();
	}
	
	private void populateCharMap() {
		charMap = new HashMap<Character, Integer>();
		charSortedMap = new TreeMap<Character, Integer>(new CustomComparator(charMap));
		for(RomanCharType c : RomanCharType.values()) {
			charMap.put(c.getRomanChar(), c.getFactor());
		}
		charSortedMap.putAll(charMap);
	}
	
	/**
	 * 
	 * @author Vikram
	 * This class declares Roman Numerals.
	 */
	public enum RomanCharType {
		one('I',1),
		two('V',5),
		three('X',10),
		four('L',50),
		five('C',100),
		six('D',500),
		seven('M',1000);
		private final int factor;
		private final char romanChar;

		RomanCharType(char romanChar,int factor) {
			this.romanChar = romanChar;
			this.factor = factor;
		}

		public int getFactor() {
			return factor;
		}

		public char getRomanChar() {
			return romanChar;
		}

	}

	public Map<Character, Integer> getCharSortedMap() {
		return charSortedMap;
	}

	public static CharacterPool getCharPoolInstance() {
		if(charPoolInstance == null) {
			charPoolInstance = new CharacterPool();
		}
		return charPoolInstance;
	}

	public Map<Character, Integer> getCharMap() {
		return charMap;
	}

}
