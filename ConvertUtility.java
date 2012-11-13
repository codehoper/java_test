package com.framehawk.roman;

/**
 * This utility class converts Roman number to decimal equivalent and vice versa.
 * @author Vikram
 *
 */
public class ConvertUtility {

	public static final int ERROR = -999;
	public static final String ERROR_MSG = "Invalid";
	public static final int UPPER_BOUND = 6000;
	public static final String OVERFLOW = "overflow";
	public static final CharacterPool charPool = CharacterPool.getCharPoolInstance();

	//When smaller values precede larger values, 
	//the smaller values are subtracted from the larger values
	/**
	 * '
	 * @param ip : Roman number
	 * @return : decimal equivalent
	 */
	public static int convRomanToDec(String ip) {
		int out = 0;
		int prevMax = 1000;
		int current = 0;
		char[] input = ip.toCharArray();
		for(int i=0;i<input.length;i++) {
			current = charPool.getCharMap().get(input[i]);
			if(current > prevMax) {
				int temp2 = current - 2 * prevMax;
				out += temp2;
			} else {
				out += current;
			}
			prevMax = current;
		}
		return out;
	}

	/**
	 * 
	 * @param input : decimal number
	 * @return : Roman equivalent
	 */
	public static String convDecToRoman(int input) {
		String out = "";
		if(input == ERROR) {
			out = ERROR_MSG;
		}
		else if(input > UPPER_BOUND){
			out = OVERFLOW;
		}
		else {
			int number =   input;
			int factor;
			int remainder;			
			for(Character charValue : charPool.getCharSortedMap().keySet()) {
				Integer value = charPool.getCharMap().get(charValue);
				if(number < 3 && number >0) {
					while(number !=  0) {
						out += 'I';
						number--;
					}
				}
				if(number == 0) {
					break;
				}
				factor = number/value;
				remainder = number % value;
				if(factor > 0) {
					while(factor != 0) {
						out += charValue;
						factor--;
						number = number -value;
					}
				}
				else if(remainder == value - 1) {
					out += 'I';
					out += charValue;
					factor--;
					number = number - remainder;
				}
			}
		}
		return out;
	}


}
