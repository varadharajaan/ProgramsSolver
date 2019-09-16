package FindBase7;

import java.util.ArrayList;
import java.util.Scanner;

public class FindBase7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = { "0", "a", "t", "l", "s", "i", "n" };
		String val = null;

		Integer number = scanner.nextInt();
		ArrayList<Integer> result = new ArrayList<>();

		int remainder = 0;
		boolean finish = false;

		while (!finish) {
			if (number == 0) {
				finish = true;
			} else {
				remainder = number % 7;
				number = number / 7;
				result.add(remainder);
			}
			remainder = 0;
		}
		for (int i = result.size() - 1; i >= 0; i--) {
			int a = result.get(i);
			val = String.valueOf(a);
			String[] strArr = val.split("");

			for (int j = 0; j < strArr.length; j++) {
				System.out.print(str[Integer.parseInt(strArr[j])]);
			}

		}

	}

}
