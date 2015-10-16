import java.util.*;
import java.math.*;
import java.io.*;



public class ASub {

	public static void main(String[] args) {

		Kattio k = new Kattio(System.in);
		
		//int[] cookies = new int[31];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int totalCookies = 0;

		int arrA[] = new int[670];
		int arrB[] = new int[448900];

		String[] testArr = new String[1000];

		for(int i = 0; i < testArr.length; i = i + 2) {
			testArr[i] = 294071125 + "";
			testArr[i + 1] = "#";
		}

		System.out.println("Starting");
		long startTime = System.currentTimeMillis();


		//while(k.hasMoreTokens()) {
		for(int t = 0; t < testArr.length; t++) {

			// String current = k.getWord();
			String current = testArr[t];

			if(current.equals("#")) {
				int temp = new Integer(totalCookies);
				// int whatI = new Integer(totalCookies)

				if(totalCookies % 2 == 0) {
					temp = (temp / 2) + 1;
				} else {
					temp = (temp + 1) / 2;
				}
				
				int toUse = -1;
				for(int j = 0; j < 671; j++) {
					//System.out.println(j);
					if(temp - arrA[j] <= 0) {
						break;
					} else {
						temp = temp - arrA[j];
						toUse += 448900;
					}
				}

				for(int j = 0; j < 671; j++) {
					if(temp - arrB[j] <= 0) {
						break;
					} else {
						temp = temp - arrB[j];
						toUse += 670;
					}
				}

				int counter1 = 0;
				for(int i = toUse; i < 300000001; i++) {
					//System.out.println(i);
					counter1++;
					if(map.containsKey(i)) {
						temp -= map.get(i);
						if(temp <= 0) {
							int toPutBack = map.get(i);
							toPutBack--;
							if(toPutBack == 0) {
								map.remove(i);
							} else {
								map.put(i, toPutBack);
							}
							totalCookies--;
							System.out.println(counter1);
							//System.out.println(i);
							break;
						}

					}

				}
			}
			else {
				int toAdd = Integer.parseInt(current);
				if(map.containsKey(toAdd)) {
					int toPutBack = map.get(toAdd);
					toPutBack++;
					map.put(toAdd, toPutBack);
				} else {
					map.put(toAdd, 1);
				}

				arrB[toAdd / 670]++;
				arrA[(toAdd / 670) / 670]++;

				totalCookies++;
				
			}

		//}

		}
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);


	}	


}