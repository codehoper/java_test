package com.ub.sort;

public interface Sortable {
	
	public enum SortType {
		BUBBLE,
		MERGE,
		QUICK
	}
	public void doSort(int a[]);
}
