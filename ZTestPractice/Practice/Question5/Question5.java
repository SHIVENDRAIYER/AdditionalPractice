import java.util.*;

public class Question5 {

	public static void main(String[] args) {

                                  Question5 ques5 = new Question5();
		String input = "Hello*world";
		System.out.println(ques5.characterCheck(input));
	}

	public static boolean characterCheck(String input) {

		boolean b = false;
		StringTokenizer t = new StringTokenizer(input, "*");
		String s1 = t.nextToken();
		String s2 = t.nextToken();
		String s3 = s1.substring(s1.length() - 1);
		String s4 = s2.substring(0, 1);

		if (s3.equalsIgnoreCase(s4)) {

			b = true;
		}
		return b;
	}
}