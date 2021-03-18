public class Question26 {

	public static void main(String[] args) {

		Question26 ques26 = new Question26();
		//int a[] = { 2, 1, 4, 1, 2, 3, 6 };
		 int a[] = { 1, 2, 1, 3, 4, 5, 8};
		System.out.println(ques26.sequenceInArray(a));
	}

	public boolean sequenceInArray(int a[]) {

		boolean b = false;
		int n = 0;

		for (int i = 0; i < a.length - 1; i++) {

			if ((a[i + 1] - a[i]) == 1) {
				
				n++;
			}
		}

		if (n == 2) {
			b = true;
		}

		return b;
	}

}
