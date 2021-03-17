import java.util.*;

public class Question17 {
	public static void main(String[] args) {

                                  Question17 ques17 = new Question17();
		List<String> l1 = new ArrayList<String>();
		l1.add("aaa");
		l1.add("bb");
		l1.add("ccc");
		l1.add("d");
		
		String s1 = "bb";
		System.out.println("output:" + ques17.StringsNotOfGivenLength(l1, s1));

	}

	public int StringsNotOfGivenLength(List<String> l1, String s1) {

		int n1 = s1.length();
		int c = 0;
		for (int i = 0; i < l1.size(); i++) {

			int n2 = l1.get(i).length();

			if (n1 != n2) {

				c++;
			}
		}
		return c;
	}

}
