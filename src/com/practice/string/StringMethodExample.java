package com.practice.string;

public class StringMethodExample {
	public static void main(String[] args) {

		// Example
		String str = "Geeks for Geeks";
		System.out.println("Length - " + str.length());
		System.out.println("Upper case - " + str.toUpperCase());
		System.out.println("Sub string - " + str.substring(2, 7));

		// 1. int length() Method
		String str1 = "Hello World !";
		System.out.println("Length - " + str1.length());

		// 2. charAt(int i) Method
		String str2 = "Hello World !";
		System.out.println("chartAt() - " + str2.charAt(3));

		// 3.String substring(int i) Method
		String str3 = "Hello World !";
		System.out.println("substring() - " + str3.substring(2));

		// 4. String substring(int i, int j) Method
		String str4 = "Hello World !";
		System.out.println("substring() - " + str4.substring(2, 7));

		// 5. String concat( String str) Method
		String str5 = "Hello World !";
		System.out.println("concat() - " + str5.concat("!!!!!"));

		// 6. int indexOf(String s) Method
		String str6 = "Hello World !";
		System.out.println("indexOf() - " + str6.indexOf("l"));

		// 7. int indexOf(String s, int i) Method
		String str7 = "Hello World !";
		System.out.println("indexOf() - " + str7.indexOf("l", 4));

		// 8. int lastIndexOf(String s) Method
		String str8 = "Hello World !";
		System.out.println("lastIndexOf() - " + str8.lastIndexOf("l"));

		// 9. boolean equals(Object otherObj) Method
		String str9 = "Hello World !";
		System.out.println("equals() - " + str9.equals("Hello World !"));

		// 10. boolean equalsIgnoreCase(String anotherString) Method
		String str10 = "Hello World !";
		System.out.println("equalsIgnoreCase() - " + str10.equalsIgnoreCase("hello world !"));

		// 11. int compareTo(String anotherString) Method
		String str11 = "Hello World!";
		System.out.println("compareTo() - " + str11.compareTo("Hello, Java"));

		// 12. int compareToIgnoreCase(String anotherString) Method
		String str12 = "Hello World !";
		System.out.println("compareToIgnoreCase() - " + str12.compareToIgnoreCase("Hello Java !"));

		// 13. String toLowerCase() Method
		String str13 = "Hello World !";
		System.out.println("toLowerCase() - -" + str13.toLowerCase());

		// 14. String toUpperCase() Method
		String str14 = "Hello World !";
		System.out.println("toUpperCase() - " + str14.toUpperCase());

		// 15. String trim() Method
		String str15 = "         Hello World    !";
		System.out.println("trim() - " + str15.trim());

		// 16. String replace(char oldChar, char newChar) Method
		String str16 = "Hello World !";
		System.out.println("replace() - " + str16.replace("l", "x"));

		// 17. boolean contains(CharSequence sequence) Method
		String str17 = "Hello World !";
		System.out.println("contains() - " + str17.contains("world"));

		// 18. char[] toCharArray() Method
		String str18 = "Hello";
		char[] chars = str18.toCharArray();
		for (char ch : chars) {
			System.out.print(ch + " ");
		}

		System.out.println();

		// 19. boolean startsWith(String prefix) Method
		String str19 = "Hello World !";
		System.out.println("startsWith() - " + str19.startsWith("l"));

	}
}
