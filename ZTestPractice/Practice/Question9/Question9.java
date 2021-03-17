import java.util.*;

public class Question9 {

	public static void main(String[] args) {

                                  Question9 ques9 = new Question9();
		String[] s = { "red", "green", "blue", "ivory" };
		int n = 1;
		System.out.println(ques9.retrievingRequiredColor(s, n));
	}

	public String retrievingRequiredColor(String[] s, int n) {

		String s1 = new String();
		List<String> l = new ArrayList<String>();
		for (int i = 0; i < s.length; i++) {

			l.add(s[i]);
		}
		Collections.sort(l, Collections.reverseOrder());

		for (int i = 0; i < l.size(); i++) {
			if (i == (n - 1)) {

				s1 = l.get(i);
			}
		}
		return s1;
	}

}
