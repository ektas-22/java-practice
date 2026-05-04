package com.practice.string;

public class StringMethodExample {
	public static void main(String[] args) {

		// Example
		String str = "Geeks for Geeks";
		System.out.println("Length - " + str.length());
		System.out.println("Upper case - " + str.toUpperCase());
		System.out.println("Sub string - " + str.substring(2, 7));

		String str1 = "Hello World !";

		// 1. int length() Method

		System.out.println("Length - " + str1.length());

		// 2. charAt(int i) Method
		System.out.println("chartAt() - " + str1.charAt(3));

		// 3.String substring(int i) Method
		System.out.println("substring() - " + str1.substring(2));

		// 4. String substring(int i, int j) Method
		System.out.println("substring() - " + str1.substring(2, 7));

		// 5. String concat( String str) Method
		System.out.println("concat() - " + str1.concat("!!!!!"));

		// 6. int indexOf(String s) Method
		System.out.println("indexOf() - " + str1.indexOf("l"));

		// 7. int indexOf(String s, int i) Method
		System.out.println("indexOf() - " + str1.indexOf("l", 4));

		// 8. int lastIndexOf(String s) Method
		System.out.println("lastIndexOf() - " + str1.lastIndexOf("l"));

		// 9. boolean equals(Object otherObj) Method
		System.out.println("equals() - " + str1.equals("Hello World !"));

		// 10. boolean equalsIgnoreCase(String anotherString) Method
		System.out.println("equalsIgnoreCase() - " + str1.equalsIgnoreCase("hello world !"));

		// 11. int compareTo(String anotherString) Method
		System.out.println("compareTo() - " + str1.compareTo("Hello, Java"));

		// 12. int compareToIgnoreCase(String anotherString) Method
		System.out.println("compareToIgnoreCase() - " + str1.compareToIgnoreCase("Hello Java !"));

		// 13. String toLowerCase() Method
		System.out.println("toLowerCase() - " + str1.toLowerCase());

		// 14. String toUpperCase() Method
		System.out.println("toUpperCase() - " + str1.toUpperCase());

		// 15. String trim() Method
		System.out.println("trim() - " + str1.trim());

		// 16. String replace(char oldChar, char newChar) Method
		System.out.println("replace() - " + str1.replace("l", "x"));

		// 17. boolean contains(CharSequence sequence) Method
		System.out.println("contains() - " + str1.contains("world"));

		// 18. char[] toCharArray() Method
		char[] chars = str1.toCharArray();
		for (char ch : chars) {
			System.out.print(ch + " ");
		}
		System.out.println();

		// 19. boolean startsWith(String prefix) Method
		System.out.println("startsWith() - " + str1.startsWith("l"));

	}
}
