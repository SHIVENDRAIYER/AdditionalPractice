
public class Question28 {

	public static void main(String[] args) {

		Question28 ques28 = new Question28();
		String inp1 = "bowboy";
		String inp2 = "bow";
		System.out.println(ques28.printingStringDependingOncharCount(inp1, inp2));
	}

	public String printingStringDependingOncharCount(String inp1, String inp2) {

		StringBuilder sb = new StringBuilder();
		int n1 = inp2.length();
		if (n1 == 3) {

			for (int i = 0; i < n1 - 1; i++) {
				
				sb.append(inp1.substring(0, n1));
			}
		} else if (n1 == 2) {
			
			for (int i = 0; i < n1 + 1; i++) {
				
				sb.append(inp1.substring(0, n1));
			}
		}
		
		return sb.toString();
	}

}
