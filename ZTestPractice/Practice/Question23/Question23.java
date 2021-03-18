import java.util.*;

public class Question23 {

	public static void main(String[] args) {

		Question23 ques23 = new Question23();
		String[] inp = { "100", "111", "10100", "10", "1111" };
		ques23.getCount(inp);
	}

	public void getCount(String[] inp) {

		int op = 0;
		ArrayList<String> l1 = new ArrayList<String>();
		for (String s : inp) {

			if (s.startsWith("10") || s.startsWith("01") && (s.length() > 2)) {

				l1.add(s);
			}
		}
		op = l1.size();
		System.out.println(op);
	}

}
