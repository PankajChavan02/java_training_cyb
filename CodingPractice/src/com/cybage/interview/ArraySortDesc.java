package com.cybage.interview;

import java.util.Arrays;

public class ArraySortDesc {

	public static void main(String[] args) {
		Integer arr[] = {1,5,4,6,23,5,7,8,5,4,0};
		Arrays.sort(arr,(a,b)->b-a);

	}

}
