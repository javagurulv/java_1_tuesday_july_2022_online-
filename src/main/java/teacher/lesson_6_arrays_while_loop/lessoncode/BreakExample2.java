package teacher.lesson_6_arrays_while_loop.lessoncode;

class BreakExample2 {

	public static void main(String[] args) {
		//int[][] arr = new int[5][5];

		int[] array = {1, 2, 3, 4};
		for(int j = 0; j < array.length; j++) {
			if (j == 2) {
				continue;
			}

			int number = array[j];
			System.out.println(j + " = " + number);
		}


/*
		int[][] arr = {{0, 1, 0},
				       {4, 5, 9},
					   {7, 8, 0}};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int number = arr[i][j];
				System.out.println("" + i + "," + j + " = " + number);
				if (j == 3) {
					break;
				}
			}
			//break;
		}
*/
	}

}
