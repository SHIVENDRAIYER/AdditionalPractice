import java.util.*;

public class Question18 {

	public static void main(String[] args) {

		Question18 ques18 = new Question18();
		int a[] = { 10, 10, 20, 30, 76 };
		int b = 10;
		int c[] = ques18.removalOfGivenElementFromArray(a, b);
		for (int d : c) {

			System.out.println(d);
		}
	}

	public int[] removalOfGivenElementFromArray(int a[], int b) {

		List<Integer> l1 = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {

			if (a[i] != b) {

				l1.add(a[i]);
			}
		}

		int c[] = new int[l1.size()];
		for (int i = 0; i < c.length; i++) {

			c[i] = l1.get(i);
		}
		return c;
	}

}
