package com.testing.test_cg;

/**
 * Simple utility to check whether a number is even or odd.
 * Replaces the previous empty Test2 class.
 */
public class Test2 {

	/** Return true if n is even. Works for negative numbers as well. */
	public static boolean isEven(long n) {
		return (n % 2L) == 0L;
	}

	/** Convenience: return string "Even" or "Odd". */
	public static String evenOdd(long n) {
		return isEven(n) ? "Even" : "Odd";
	}

	/**
	 * Main method with sample test cases. If command-line arguments are
	 * provided they will be parsed as integers and checked too.
	 */
	public static void main(String[] args) {
		long[] tests = {0, 1, 2, 15, 100, -4, Long.MAX_VALUE, Long.MIN_VALUE};

		System.out.println("Even/Odd Checker\n");
		for (long t : tests) {
			System.out.printf("%d -> %s%n", t, evenOdd(t));
		}

		if (args.length > 0) {
			System.out.println("\nFrom command-line args:");
			for (String a : args) {
				try {
					long v = Long.parseLong(a);
					System.out.printf("%d -> %s%n", v, evenOdd(v));
				} catch (NumberFormatException ex) {
					System.out.printf("%s -> not a valid integer%n", a);
				}
			}
		}
	}
}

