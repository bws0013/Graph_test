import java.util.*;
import java.math.*;
import java.io.*;

// https://open.kattis.com/problems/coast

public class ASub {

	public static void main(String[] args) {

		Kattio k = new Kattio(System.in);

		short y = (short) k.getInt();
		short x = (short) k.getInt();

		int[][] matrix = new int[y + 2][x + 2];

		for(int i = 0; i < y; i++) {
			String line = k.getWord();
			for (int j = 0; j < x; j++) {
				int toAdd = Integer.parseInt(line.charAt(j) + "");
				if(toAdd == 0) {
					matrix[i + 1][j + 1] = 2;
				} else {
					matrix[i + 1][j + 1] = 1;
				}
			}
		}

		HashMap<Integer, int[]> map = new HashMap <Integer, int[]>();

		
		for(int i = 1; i < y + 1; i++) {
			for(int j = 1; j < x + 1; j++) {
				int loc = (i * y) + j;
				int[] neighbors = new int[4]; // up, down, left, right
				neighbors[0] = matrix[i - 1][j];
				neighbors[1] = matrix[i + 1][j];
				neighbors[2] = matrix[i][j - 1];
				neighbors[3] = matrix[i][j + 1];

				map.put(loc, neighbors);
			}
		}
		
		

		for(int i = 0; i < y + 2; i++) {
			
			for(int j = 0; j < x + 2; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();

		}


	}	


	
}