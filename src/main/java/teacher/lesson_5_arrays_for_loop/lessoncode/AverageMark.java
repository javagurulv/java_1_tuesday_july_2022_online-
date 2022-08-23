package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Random;

public class AverageMark {

	public double calculateAverageMark(int marksCount) {
		int[] marks = generateRandomMarks(marksCount);
		int marksSum = calculateMarksSum(marks);
		return calculateAverageMark(marksSum, marks);
	}


	public static void main(String[] args) {
		int[] marks = generateRandomMarks(10);
		printMarksToConsole(marks);
		int marksSum = calculateMarksSum(marks);
		double averageMark = calculateAverageMark(marksSum, marks);
		printAverageMarkToConsole(averageMark);

/*
		int[] marks = new int[20];
		Random random = new Random();
		for (int i = 0; i < marks.length; i++) {
			int newMark = random.nextInt(10);
			marks[i] = newMark;
		}

		for (int i = 0; i < marks.length ; i++) {
			System.out.println(marks[i]);
		}

		int sum = 0;
		for (int i = 0; i < marks.length ; i++) {
			sum = sum + marks[i];
		}

		double averageMark = (double) sum / marks.length;

		System.out.println("Average mark = " + averageMark);
*/
	}

	private static void printAverageMarkToConsole(double averageMark) {
		System.out.println("Average mark = " + averageMark);
	}

	private static double calculateAverageMark(int marksSum, int[] marks) {
		return (double) marksSum / marks.length;
	}

	private static void printMarksToConsole(int[] marks) {
		for (int i = 0; i < marks.length ; i++) {
			System.out.println(marks[i]);
		}
	}

	private static int calculateMarksSum(int[] marks) {
		int sum = 0;
		for (int i = 0; i < marks.length ; i++) {
			sum = sum + marks[i];
		}
		return sum;
	}

	private static int calculatePositiveMarksCount(int[] marks) {
		int count = 0;
		for (int i = 0; i < marks.length ; i++) {
			if (marks[i] >= 4) {
				count = count + 1;
			}
		}
		return count;
	}

	private static int calculatePositiveMarksSum(int[] marks) {
		int sum = 0;
		for (int i = 0; i < marks.length ; i++) {
			if (marks[i] >= 4) {
				sum = sum + marks[i];
			}
		}
		return sum;
	}

	private static int[] generateRandomMarks(int markCount) {
		int[] marks = new int[markCount];
		Random random = new Random();
		for (int i = 0; i < marks.length; i++) {
			int newMark = random.nextInt(10);
			marks[i] = newMark;
		}
		return marks;
	}

}
