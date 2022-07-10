package lab.question2;

import java.util.Scanner;

public class CurrencyDenominations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size;
		System.out.println("Enter the size of currency denominations");
		size = sc.nextInt();
		System.out.println("Enter the currency denominations value");
		int[] currency = new int[size];
		for (int i = 0; i < size; i++) {
			currency[i] = sc.nextInt();
		}
		int amount;
		System.out.println("Enter the amount you want to pay");
		amount = sc.nextInt();
		sort(currency);
		int[] currvalid = new int[size];

		for (int i = 0; i < size; i++) {
			if (amount / currency[i] > 0) {
				try {
					currvalid[i] = amount / currency[i];
					amount = amount % currency[i];
				} catch (ArithmeticException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i = 0; i < size; i++) {
			if (currvalid[i] != 0) {
				System.out.println(currency[i] + ":" + currvalid[i]);
			}
		}
		sc.close();
	}

	static void sort(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int maxi = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] > arr[maxi])
					maxi = j;

			int temp = arr[maxi];
			arr[maxi] = arr[i];
			arr[i] = temp;
		}
	}

}
