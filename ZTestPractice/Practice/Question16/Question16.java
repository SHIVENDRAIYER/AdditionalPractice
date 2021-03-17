public class Question16 {

	public static void main(String[] args) {


		Question16 ques16 = new Question16();
		String s = "madam";
		System.out.println(ques16.palindromeAndVowelCheck(s));
	}

	public boolean palindromeAndVowelCheck(String s) {

		boolean b = true;
		int c = 0;
		String s1 = "aeiou";
		StringBuilder sb = new StringBuilder(s);
		String s2 = sb.reverse().toString();

		if (s2.equals(s)) {

			b = false;
		} else {

			for (int i = 0; i < s1.length(); i++) {

				for (int j = 0; j < s.length(); j++) {

					if (s1.charAt(i) == s.charAt(j)) {

						c++;
						continue;
					}
				}
			}
			if (c < 2) {

				b = false;
			}
		}

		return b;
	}
}
