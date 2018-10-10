import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacer {
	public static void main(String[] args) {
		final String in = "key1 val1 key2 \"val 2\"";
		String re = "(\\S+)\\s+([^\\s\"]+|\"[^\"]*\")";
		println(in.replaceAll(re, "$1 $2,"));
	}

	private static void println(Object o) {
		System.out.println(o);
	}
}
