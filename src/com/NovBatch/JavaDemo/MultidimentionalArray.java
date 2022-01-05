package com.NovBatch.JavaDemo;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] k = new int[2][2];

		k[0][0] = 2;

		k[0][1] = 4;

		k[1][0] = 1;

		k[1][1] = 3;

		for (int j = 0; j < k.length; j++) {

			for (int i = 0; i < k.length; i++) {

				System.out.print(k[j][i] + " ");
			}
			System.out.println("");
		}

	}

}
