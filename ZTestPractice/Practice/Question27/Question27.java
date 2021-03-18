import java.util.*;

public class Question27 {

	public static void main(String[] args) {

		Question27 ques27 = new Question27();
		String inp1 = "AAA/abb/CCC";
		char inp2 = '/';
		String op[] = ques27.loweringCasenReverseofaString(inp1, inp2);
		for (String str : op) {

			System.out.println(str);
		}
	}

	public String[] loweringCasenReverseofaString(String inp1, char inp2) {

		List<String> l = new ArrayList<String>();
		StringTokenizer t = new StringTokenizer(inp1, "/");
		while (t.hasMoreTokens()) {

			StringBuilder sb = new StringBuilder(t.nextToken().toLowerCase());
			l.add(sb.reverse().toString());
		}

		String op[] = new String[l.size()];
		for (int i = 0; i < op.length; i++) {

			op[i] = l.get(i);
		}
		return op;
	}

}
