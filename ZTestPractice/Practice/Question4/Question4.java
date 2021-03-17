
import java.util.*;

public class Question4 {

	public static void main(String[] args) {

                                  Question4 ques4 = new Question4();
		List<String> l1 = new ArrayList<String>();
		l1.add("apple");
		l1.add("orange");
		l1.add("grapes");

		List<String> l2 = new ArrayList<String>();
		l2.add("melon");
		l2.add("apple");
		l2.add("mango");

		String[] s2 = ques4.fruitsList(l1, l2);
		for (String s3 : s2) {

			System.out.println(s3);
		}
	}

	public String[] fruitsList(List<String> l1, List<String> l2) {

		List<String> l3 = new ArrayList<String>();

		for (int i = 0; i < l1.size(); i++) {

			String s1 = l1.get(i);
			if (s1.charAt(0) != 'a' && s1.charAt(0) != 'A' && s1.charAt(0) != 'g' && s1.charAt(0) != 'G') {

				l3.add(s1);
			}
		}

		for (int i = 0; i < l2.size(); i++) {

			String s2 = l2.get(i);
			if (s2.charAt(s2.length() - 1) != 'n' && s2.charAt(s2.length() - 1) != 'N'
					&& s2.charAt(s2.length() - 1) != 'e' && s2.charAt(s2.length() - 1) != 'E') {
				l3.add(s2);
			}
		}

		Collections.sort(l3);
		String[] s2 = new String[l3.size()];
		for (int i = 0; i < s2.length; i++) {

			s2[i] = l3.get(i);
		}
		return s2;
	}
}