package prob04;

import java.util.Arrays;

public class StringUtil {
	public static String concatenate(String[] str) {

		int length = str.length;
		String[] result = new String[length];

		for (int i = 0; i < length; i++) {
			result[i] = str[i];
		}

		String text = Arrays.toString(result);

		text = text.replace(",", "");
		text = text.replace(" ", "");
		text = text.replace("[", "");
		text = text.replace("]", "");

		return text;
	}
}