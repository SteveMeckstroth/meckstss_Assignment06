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
	
	//Declare an int to build a pyramid of sums that is the same size as the original data set 
	private int[][] sums = new int[15][];
		
	public static void main(String[] args) {
		//Instantiate this class to avoid static method errors
		Main euler18 = new Main();
		
		// Load Euler data into two arrays, one for the original values, the other for the sums
		euler18.LoadEulerData();
		euler18.LoadEulerSums();
		
		System.out.println("Higest sum: " + euler18.findHighestSum());
		
		//Show the path used to get the highest sum
		euler18.showNumbersUsed();
	}
	
	/**
	 * Load the source data from Project Euler problem 18 to the data array
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
	
	/**
	 * Load the source data from Project Euler problem 18 to the sums array
	 * these values will change during the program so a new array was created
	 */
	private void LoadEulerSums() {
		sums[0] = new int[]{75};	
		sums[1] = new int[]{95,64};
		sums[2] = new int[]{17,47,82};
		sums[3] = new int[]{18,35,87,10};
		sums[4] = new int[]{20,04,82,47,65};
		sums[5] = new int[]{19,01,23,75,03,34};
		sums[6] = new int[]{88,02,77,73,07,63,67};
		sums[7] = new int[]{99,65,04,28,06,16,70,92};
		sums[8] = new int[]{41,41,26,56,83,40,80,70,33};
		sums[9] = new int[]{41,48,72,33,47,32,37,16,94,29};
		sums[10] = new int[]{53,71,44,65,25,43,91,52,97,51,14};
		sums[11] = new int[]{70,11,33,28,77,73,17,78,39,68,17,57};
		sums[12] = new int[]{91,71,52,38,17,14,91,43,58,50,27,29,48};
		sums[13] = new int[]{63,66,04,68,89,53,67,30,73,16,69,87,40,31};
		sums[14] = new int[]{04,62,98,27,23,9,70,98,73,93,38,53,60,04,23};
		
	}
	/**
	 * Iterates through the data array from the bottom up to find the best path
	 */
	private int findHighestSum() {
		//Use an ArrayList to store the sums for each row
		
		
		//Iterate starting at the 2nd from the bottom row of the triangle
		for(int i = data.length - 2; i >= 0; i--) {
			
			//Iterate across the columns of the row comparing the number down to the left
			// to the number down to the right, add the number that produces the largest sum
			// to the sums Array
			for(int j = 0; j < data[i].length; j++) {
				//If the number to the bottom left is bigger use that one
				//else use the number to the bottom right
				//once a number is chosen add it to the sums array
				if( sums[i + 1][j] > sums[i + 1][j + 1]) {
					sums[i][j] = sums[i + 1][j] + data[i][j]; 
					
				} else {
					sums[i][j] = sums[i + 1][j + 1] + data[i][j];
				}
			}
		}
		
		//The highest sum should be at the top of the new pyramid
		return sums[0][0];
	}
	
	/**
	 * Print a string showing the numbers used to get the max sum
	 * because I must know the path!
	 */
	private void showNumbersUsed() {
		ArrayList<Integer> numbersUsed = new ArrayList<Integer>();
		int jused = 0;//Represents col index of the above used number
		numbersUsed.add(data[0][0]);
		
		//Iterate top down through the pyramid of sums
		for(int i = 1; i < sums.length; i++) {
			
			//if the sum to the bottom left matches then store the value
			//otherwise use the one to the bottom right
			if(sums[i][jused] + data[i-1][jused]== sums[i-1][jused]) {
				numbersUsed.add(data[i][jused]);
			} else {
				numbersUsed.add(data[i][jused + 1]);
				jused++;
			}
		}
		System.out.println("Path used (from top to bottom): " + numbersUsed.toString());
	}
}
