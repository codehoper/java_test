package com.ub.sort;

import com.ub.sort.Sortable.SortType;

public class Sort implements Sortable{

	public SortType sortType;
	public int [] toBeSortArray;
	public Sort(SortType sortType) {
		this.sortType = sortType;
	}

	@Override
	public void doSort(int[] a) {
		this.toBeSortArray = a;
		if(sortType == SortType.MERGE) {
			
		}
		else if (sortType == SortType.QUICK) {
			
		}
		else if(sortType == SortType.MERGE) {
			
		}
		
	}
	
	
	
}
