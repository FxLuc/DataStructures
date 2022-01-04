package DataStructures.RecursionPalindrome;

public class Main {
    public static void main(String[] args) {
        String str = "malam";
		System.out.println(isPalindrome(str));
        str = "hasagi";
		System.out.println(isPalindrome(str));

        // Output:
        // true
        // false
    }

	static boolean isPalindrome(String str) {
		int back = str.length();
        int front = 0;
		if (back <= 1)
			return true;
		return isPalindrome(str, front, back - 1);
	}

    static boolean isPalindrome(String str, int front, int back) {
		if (str.charAt(front) != str.charAt(back))
			return false;
		if (front < back + 1)
			return isPalindrome(str, front + 1, back - 1);
		return true;
	}
}
