package com.framehawk.roman;

/**
 * This class implements all arithmetic operation.
 * @author Vikram
 *
 */
public class Operation implements Operatable{


	@Override
	public int perfomOperation(OperationType operation, int first,
			int second) {
		switch (operation) {
		case ADD :	
			return first + second;
		case SUBTRACT:
			if(second < first) {
				//To avoid negative & zero result
				return first - second;
			} 
			break;
		case DIVIDE:
			return first / second;
		case MULTIPLY:
			return first *  second;
		}
		return ConvertUtility.ERROR;
	}

}
