package lab.question1;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		int size;
		int[] transtion = null;
		int testNo;
		int tragetTrans;
		int sumTrans = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		size = sc.nextInt();
		System.out.println("Enter the values of array");

		transtion = new int[size];
		for (int i = 0; i < size; i++) {
			transtion[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");

		testNo = sc.nextInt();
		while (testNo-- > 0) {
			System.out.println("Enter the value of target");
			tragetTrans = sc.nextInt();

			for (int i = 0; i < size; i++) {
				sumTrans += transtion[i];
				if (sumTrans >= tragetTrans) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					break;
				}
			}
			if (sumTrans < tragetTrans) {
				System.out.println("Given target is not achieved");
			}
		}
		sc.close();
	}

}
