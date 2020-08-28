package yaksha;

import java.util.*;

public class MainClass {

	static int addSquareCube(NumberList numberList) {
		int length = numberList.getNumber().length;
		int sumeven = 0, sumodd = 0;
		int number[] = numberList.getNumber();
		for (int i = 0; i < length; i++) {
			if (number[i] % 2 == 0) {

				sumeven = sumeven + (number[i] * number[i]);
			} else {
				sumodd = sumodd + (number[i] * number[i] * number[i]);
			}
		}
		return sumeven + sumodd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scanner.nextInt();
		System.out.println("Enter numbers");
		int number[] = new int[size];
		for (int i = 0; i < size; i++) {
			number[i] = scanner.nextInt();
		}
		NumberList numberList = new NumberList(number);
		int sumSquareCube = addSquareCube(numberList);
		System.out.print("sum of cubes and squares of elements in an array : ");
		System.out.println(sumSquareCube);
		scanner.close();
	}
}
