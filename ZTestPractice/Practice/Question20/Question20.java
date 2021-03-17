public class Question20 {

	public static void main(String[] args) {

	                 Question20 ques20 = new Question20();
		String[] inp = { "Vikas", "Lokesh", "Ashok" };
		System.out.println(ques20.getTheNamesinGivenFormat(inp));
	}

	public String getTheNamesinGivenFormat(String[] inp) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < inp.length; i++) {
			
			sb.append(inp[i]).append(',');
		}
		sb.deleteCharAt(sb.length() - 1);

		return sb.toString();
	}

}
