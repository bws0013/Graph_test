import java.util.*;
import java.math.*;
import java.io.*;

// https://open.kattis.com/problems/coast

public class ZSub {

	public static void main(String[] args) {

		Kattio k = new Kattio(System.in);

		short y = (short) k.getInt();
		short x = (short) k.getInt();

		int[][] matrix = new int[y + 2][x + 2];

		for(int i = 0; i < y; i++) {
			String line = k.getWord();
			for (int j = 0; j < x; j++) {
				matrix[i + 1][j + 1] = 1;
			}
		}

		int times = Math.min(x, y);
		int t = 0;
		while(t < times) {
			for(int i = 1 + t; i < x + 1 - t; i++) {
				matrix[1 + t][i] = 5;
				matrix[y - t][i] = 6;
			}
			for(int i = 1 + t; i < y + 1 - t; i++) {
				matrix[i][1 + t] = 7;
				matrix[i][x - t] = 8;
			}


			for(int i = 0; i < y + 2; i++) {
				for(int j = 0; j < x + 2; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();


			t++;
		}
		/*

		for(int i = 0; i < y + 2; i++) {
			
			for(int j = 0; j < x + 2; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();

		}
		*/

	}	


	
}