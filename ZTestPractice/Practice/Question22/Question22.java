public class Question22 {

public static void main(String[] args) {

		Question22 ques22 = new Question22();
		int x1 = 4, x2 = 8;
		int y1 = 0, y2 = 5;
		ques22.sqrt(x1, x2, y1, y2);
	}

	public void sqrt(int x1, int x2, int y1, int y2) {

		int op;
		op = (int) (Math.sqrt(((x1 + x2) * (x1 + x2)) + ((y1 + y2) * (y1 + y2 ))));
		System.out.println(op);
	}
}