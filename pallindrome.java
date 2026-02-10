public class pallindrome {

	public static boolean isPalindrome(int n) {
		if (n < 0) return false;
		int original = n;
		int rev = 0;
		int temp = n;
		while (temp > 0) {
			int d = temp % 10;
			rev = rev * 10 + d;
			temp /= 10;
		}
		return rev == original;
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
		if (isPalindrome(n)) {
			System.out.println(n + " is a palindrome.");
		} else {
			System.out.println(n + " is not a palindrome.");
		}
	}

}
