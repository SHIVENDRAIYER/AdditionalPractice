public class Question29 {

	public static void main(String[] args) {

		Question29 ques29 = new Question29();
		String str = "hello";
		int n1 = 2;
		System.out.println(ques29.formattingOfString(str, n1));
	}

	public String formattingOfString(String str, int n1) {

		String str2 = str.substring(str.length() - n1, str.length());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n1; i++) {
			
			sb.append(str2);
		}
		return sb.toString();
	}

}
