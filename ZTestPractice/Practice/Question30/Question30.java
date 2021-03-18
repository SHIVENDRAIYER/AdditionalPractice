public class Question30 {

	public static void main(String[] args) {

		Question30 ques30 = new Question30();
		String inp = "0201103311";
		boolean b = ques30.ISBNnumber(inp);
		if (b == true) {

			System.out.println("valid ISBN number");
		}

		else {

			System.out.println("check ur data");
		}
	}

	public boolean ISBNnumber(String inp) {

		boolean b = false;
		int sum = 0;
		for (int i = 0, j = inp.length(); i < inp.length(); i++, j--) {

			String s = String.valueOf(inp.charAt(i));
			int n = Integer.parseInt(s);
			sum += (n * j);
		}

		if (sum % 11 == 0) {

			b = true;
		}

		return b;
	}

}
