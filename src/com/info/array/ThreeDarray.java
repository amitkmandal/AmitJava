package com.info.array;

public class ThreeDarray {
	public static void main(String[] args) {
		int[][][] arr = new int[3][4][2];
		int num = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 2; k++) {
					arr[i][j][k] = num;
					num++;
				}
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 2; k++) {
					System.out.print("arr[" +i+ "][" +j+ "][" +k+ "] = "+arr[i][j][k]+"\t");
				}
				System.out.println();
			}
		}
	}

}
