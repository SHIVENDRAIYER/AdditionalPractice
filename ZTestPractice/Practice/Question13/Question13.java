import java.util.*;

public class Question13 {

	public static void main(String[] args) {

                                  Question13 ques13 = new Question13();
		int n1 = 90;
		int n2 = 120;

		System.out.println(ques13.sumOfPalindromeNos(n1, n2));
	}

	public int sumOfPalindromeNos(int n1, int n2) {

		List<Integer> l1 = new ArrayList<Integer>();
		for (int i = n1; i <= n2; i++) {

			int r = 0, n3 = i;
			while (n3 != 0) {

				r = (r * 10) + (n3 % 10);
				n3 = n3 / 10;
			}
			if (r == i) {

				l1.add(i);
			}
		}
		
		int s = 0;
		for (int i = 0; i < l1.size(); i++) {

			s += l1.get(i);
		}
		return s;
	}
}