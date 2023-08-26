package cntrlstmts;

public class Oddoreven {
	
	    public static void main(String[] args) {
	        int[] numbers = { 10, 7, 23, 14, 9, 6, 31, 42, 19 };

	        System.out.println("Odd Numbers:");
	        printOddNumbers(numbers);

	        System.out.println("\nEven Numbers:");
	        printEvenNumbers(numbers);
	    }

	    public static void printOddNumbers(int[] arr) {
	        for (int num : arr) {
	            if (num % 2 != 0) {
	                System.out.print(num + " ");
	            }
	        }
	    }

	    public static void printEvenNumbers(int[] arr) {
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                System.out.print(num + " ");
	            }
	        }
	    }
	}



