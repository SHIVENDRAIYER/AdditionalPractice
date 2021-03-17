public class Question11 {

	public static void main(String[] args) {

                                  Question11 ques11 = new Question11();
		int a[] = { 12, 1, 32, 3 };
		int b[] = { 0, 12, 2, 23 };
		int c[] = ques11.retrievePosition(a, b);
		for (int d : c) {

			System.out.println(d);
		}
	}

	public int[] retrievePosition(int a[], int b[]) {

		int c[] = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {

			if (i % 2 == 0) {

				c[i] = b[i];
			}
			if (i % 2 != 0) {

				c[i] = a[i];
			}
		}
		return c;
	}

}