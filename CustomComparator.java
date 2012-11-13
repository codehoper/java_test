package com.framehawk.roman;

import java.util.Comparator;
import java.util.Map;

/**
 *This comparator class is used to perform sorting on map. 
 * @author Vikram
 *
 */
public class CustomComparator  implements Comparator{
	
	Map compareMap;
	
	public CustomComparator(Map compMap) {
		this.compareMap = compMap;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		if((Integer)compareMap.get(o1) < (Integer)compareMap.get(o2)) {
			return 1;
		} else {
			return -1;
		}
	}
}
