public class Question25 {

	public static void main(String[] args) {

		String str = "Hello World";
		System.out.println(reArrangingWord(str));
	}

	public static String reArrangingWord(String str) {

		StringBuilder sb = new StringBuilder();
		sb.append(str.substring(str.length() - 1));
		sb.append(str.substring(1, str.length() - 1));
		sb.append(str.substring(0, 1));
		
		return sb.toString();
	}

}
