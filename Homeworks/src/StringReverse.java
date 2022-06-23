import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringReverse();
	}
	public static void stringReverse() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelime giriniz:");
		String enterString = scanner.next();
		String reverseString = "";
		for (int i = enterString.length() - 1; i >= 0; i--) {
			reverseString += enterString.charAt(i);
		}
		System.out.println(enterString);
		System.out.println(reverseString);
		System.out.println("Kelime " + reverseString.length() + " harfli");
	}
}
