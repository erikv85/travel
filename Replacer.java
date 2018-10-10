import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacer {
	public static String replacer2(String line, String regex, String replacement) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(line);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, replacement);
		}
		m.appendTail(sb);
		return sb.toString();
	}

	public static void main(String[] args) {
		final String str = "erik";
		final String key1 = "hey " + str;
		final String key2 = "hey \\$1";
		String res = replacer2(str, "(\\S+)", "hey $1");
		if (key1.equals(res)) {
			println("correct. "+str+" was replaced by "+res);
		} else {
			println("inccorect. "+str+" should have been replaced by "
					+ key1 +" but was instead replaced by '"+res+"'");
		}
		res = replacer2(str, "(\\S+)", "hey \\$1");
		if (key2.equals(res)) {
			println("correct. "+str+" was replaced by "+res);
		} else {
			println("inccorect. "+str+" should have been replaced by "
					+ key2 +" but was instead replaced by '"+res+"'");
		}
	}

	private static void println(Object o) {
		System.out.println(o);
	}
}
