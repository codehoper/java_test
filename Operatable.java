package com.framehawk.roman;

/**
 * This interface provides various arithmetic operation like addition,subtraction,etc.
 * @author Vikram
 *
 */
public interface Operatable {	
	
	public enum OperationType {
		ADD,
		SUBTRACT,
		DIVIDE,
		MULTIPLY;
	}
	public int perfomOperation(OperationType operation,int first , int second);	

}
