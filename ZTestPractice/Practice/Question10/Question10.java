import java.util.*;

public class Question10 {

	public static void main(String[] args) {


		Question10 ques10 = new Question10();
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		System.out.println(ques10.mergeArray(a, b));
	}

	public int mergeArray(int a[], int b[]) {

		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();

		int i, d = 0;
		for (i = 0; i < a.length; i++) {

			l1.add(a[i]);
		}

		for (i = 0; i < b.length; i++) {

			l2.add(b[i]);
		}
		l1.retainAll(l2);

		for (i = 0; i < l1.size(); i++) {

			d += (Integer) l1.get(i);
		}
		return d;
	}
}