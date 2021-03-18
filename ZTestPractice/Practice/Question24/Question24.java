public class Question24 {

	public static void main(String[] args) {

		String str = "hello";
		System.out.println(alternatingChar(str));
	}

	public static String alternatingChar(String str) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {

			if (i % 2 == 0) {

				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

}
