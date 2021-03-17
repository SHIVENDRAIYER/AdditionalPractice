import java.util.*;

public class Question7 {

	public static void main(String[] args) {

                                  Question7 ques7 = new Question7();
		Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		m1.put(1, 4);
		m1.put(2, 6);
		m1.put(4, 7);
		m1.put(5, 9);
		System.out.println(ques7.avgValuesOfOddKeys(m1));
	}

	public int avgValuesOfOddKeys(Map<Integer, Integer> m1) {

		int l = 0, m = 0;

		Iterator<Integer> i = m1.keySet().iterator();
		while (i.hasNext()) {

			int n = (Integer) i.next();

			if (n % 2 != 0) {

				m += m1.get(n);
				l++;
			}
		}
		return m / l;
	}
}
