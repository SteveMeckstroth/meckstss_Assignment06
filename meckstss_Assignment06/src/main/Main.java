/**
 * Assignment 06
 * @author Stephen Meckstroth
 * Description: An assignment to solve project Euler problem 18
 * Due Date: Mar 6, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: https://projecteuler.net/problem=18
 */
package main;

import java.util.ArrayList;

/**
 * Main Class to run the program to solve project Euler problem 18
 * @author Stephen Meckstroth
 *
 */
public class Main {
	//declare an int with format [rows][cols], there are 15 rows for problem 18
	private int[][] data = new int[15][];
	
	public static void main(String[] args) {
		// Load Euler data
		Main test = new Main();
		test.LoadEulerData();
	}
	
	/**
	 * Load the source data from Project Euler problem 18
	 */
	private void LoadEulerData() {
		data[0] = new int[]{75};	
		data[1] = new int[]{95,64};
		data[2] = new int[]{17,47,82};
		data[3] = new int[]{18,35,87,10};
		data[4] = new int[]{20,04,82,47,65};
		data[5] = new int[]{19,01,23,75,03,34};
		data[6] = new int[]{88,02,77,73,07,63,67};
		data[7] = new int[]{99,65,04,28,06,16,70,92};
		data[8] = new int[]{41,41,26,56,83,40,80,70,33};
		data[9] = new int[]{41,48,72,33,47,32,37,16,94,29};
		data[10] = new int[]{53,71,44,65,25,43,91,52,97,51,14};
		data[11] = new int[]{70,11,33,28,77,73,17,78,39,68,17,57};
		data[12] = new int[]{91,71,52,38,17,14,91,43,58,50,27,29,48};
		data[13] = new int[]{63,66,04,68,89,53,67,30,73,16,69,87,40,31};
		data[14] = new int[]{04,62,98,27,23,9,70,98,73,93,38,53,60,04,23};
	}

}
