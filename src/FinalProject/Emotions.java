package FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Emotions {

	public static List<String> happy() {
		List<String> happyEmotions = new ArrayList<String>();
		happyEmotions.add("😄");
		happyEmotions.add("🙂");
		happyEmotions.add("😊");
		happyEmotions.add("😍");

		return happyEmotions;
	}

	public static ArrayList<String> sad() {
		ArrayList<String> sadEmotions = new ArrayList<String>();
		sadEmotions.add("😢");
		sadEmotions.add("😭");
		sadEmotions.add("😞");
		sadEmotions.add("👿");

		return sadEmotions;
	}

	public static ArrayList<String> loving() {
		ArrayList<String> lovingEmoji = new ArrayList<String>();
		lovingEmoji.add("😍");
		lovingEmoji.add("😘");

		return lovingEmoji;
	}
}
