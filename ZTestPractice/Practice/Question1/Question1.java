import java.util.*;

public class Question1 {

	public static void main(String[] args) {

                                  Question1 ques1 = new Question1();
		String[] s1 = { "goa", "kerala", "gujarat" };
		ques1.putvalues(s1);
	}

	public void putvalues(String[] s1) {

		ArrayList<String> l1 = new ArrayList<String>();
		HashMap<String, String> m1 = new HashMap<String, String>();
		ArrayList<String> l2 = new ArrayList<String>();

		for (String s : s1) {

			l1.add(s.toUpperCase().substring(0, 3));
		}

		for (String s : s1) {

			l2.add(s);
		}

		for (int i = 0; i < l1.size(); i++) {

			m1.put(l1.get(i), l2.get(i));
		}

		System.out.println(m1);
	}
}
