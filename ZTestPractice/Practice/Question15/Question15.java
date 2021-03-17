public class Question15 {

	public static void main(String[] args) {

		Question15 ques15 = new Question15();
		int n = 125;
		System.out.println(ques15.sumOfSquares(n));
	}

	public int sumOfSquares(int n) {

		int a;
		int c = 0;
		while (n > 0) {

			a = n % 10;
			n = n / 10;
			c = c + (a * a);

		}
		return c;

	}
}
