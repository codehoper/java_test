package com.framehawk.roman;

import com.framehawk.roman.Operatable.OperationType;

/***
 *@author Vikram
 *
 *Perform all arithmetic operation on Roman numerics
 *Limitations of Roman number :
 *1.Zero can't be represented by Roman numbers.
 *2.No negative numbers.
 *Application limitation
 *1.No decimal point
 *2.Max result displayed <= 6000.
 * 
 */
public class RomanNumerals {

	/**
	 * 1.We can use this class for divide and multiply however corner cases for this are negative numbers and zero.
	 * 2.We can calculate compound interest with no fractional part
	 * 3.We can built calculator with following features
	 * a.All arithmetic operation(as Roman number used only for counting)
	 * b.Percentage calculation
	 * c.Can provide memory feature
	 *
	 * @param args
	 */
	public static void main(String [] args){

		Operatable operation = new Operation();

		//1.Addition 
		System.out.println( "Addition of IXX and IX ::"+ 
				ConvertUtility.convDecToRoman(
						operation.perfomOperation(OperationType.ADD,
								ConvertUtility.convRomanToDec("IXX"), 
								ConvertUtility.convRomanToDec("IX"))));
		//2.Subtraction
		System.out.println( "Subtraction of IXX and IX ::"+ 
				ConvertUtility.convDecToRoman(
						operation.perfomOperation(OperationType.SUBTRACT,
								ConvertUtility.convRomanToDec("IXX"), 
								ConvertUtility.convRomanToDec("IX"))));
		//3.Multiply
		System.out.println( "Multiplication of IX and IX ::"+ 
				ConvertUtility.convDecToRoman(
						operation.perfomOperation(OperationType.MULTIPLY,
								ConvertUtility.convRomanToDec("IX"), 
								ConvertUtility.convRomanToDec("IX"))));
		//4.Divide
		System.out.println( "Divide  IX by IX ::"+ 
				ConvertUtility.convDecToRoman(
						operation.perfomOperation(OperationType.DIVIDE,
								ConvertUtility.convRomanToDec("IX"), 
								ConvertUtility.convRomanToDec("IX"))));

		//5.convert Roman to decimal
		System.out.println("IXIV == "+ ConvertUtility.convRomanToDec("IXIV"));

		//6.convert decimal to Roman
		System.out.println("1995  == "+ ConvertUtility.convDecToRoman(1995));
	}

}
