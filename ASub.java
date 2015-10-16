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

		for(int i = 0; i < y + 2; i++) {
			
			for(int j = 0; j < x + 2; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();

		}


	}	


	
}