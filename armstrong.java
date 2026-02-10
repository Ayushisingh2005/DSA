public class armstrong {
	public static boolean isArmstrong(int n) {
		if (n < 0) return false;
		int original = n;
		int digits = String.valueOf(n).length();
		int sum = 0;
		int temp = n;
		if (temp == 0) { // 0 is an Armstrong number
			return true;
		}
		while (temp > 0) {
			int d = temp % 10;
			int p = 1;
			for (int i = 0; i < digits; i++) p *= d;
			sum += p;
			temp /= 10;
		}
		return sum == original;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter an integer: ");
		if (!sc.hasNextInt()) {
			System.out.println("Invalid input");
			sc.close();
			return;
		}
		int n = sc.nextInt();
		sc.close();
		if (isArmstrong(n)) {
			System.out.println(n + " is an Armstrong number.");
		} else {
			System.out.println(n + " is not an Armstrong number.");
		}
	}

}
