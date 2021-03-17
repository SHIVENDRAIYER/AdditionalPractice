public class Question19 {

	public static void main(String[] args) {

                                  Question19 ques19 = new Question19();
		String[] s1 = { "2AA", "12", "ABC", "C1a" };
		ques19.getSum(s1);
	}

	public void getSum(String[] s1) {

		int sum = 0;
		for (int i = 0; i < s1.length; i++) {

			for (int j = 0; j < s1[i].length(); j++) {

				char c = s1[i].charAt(j);
				if (Character.isDigit(c)) {

					String t = String.valueOf(c);
					int n = Integer.parseInt(t);
					sum = sum + n;
				}
			}
		}
		System.out.println(sum);

	}

}
