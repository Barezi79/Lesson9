package FinalProject;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MetaData {

	static Scanner s;

	public static ArrayList<ArrayList<String>> readFile() {
		try {
			s = new Scanner(new File("resource/got_meta_data.txt"));
		} catch (Exception e) {
			System.out.println("Error");
		}
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> allegianceList = new ArrayList<String>();
		ArrayList<String> messageList = new ArrayList<String>();
		ArrayList<ArrayList<String>> mainList = new ArrayList<ArrayList<String>>();

		while (s.hasNext()) {
			String nameMD = s.next();
			String allegianceMD = s.next();
			String messageMD = s.next();

			while (s.hasNext()) {
				nameMD = s.next() + " " + s.next().replaceAll(",", "");
				nameList.add(nameMD);
				allegianceMD = s.next() + " " + s.next().replaceAll(",", "");
				allegianceList.add(allegianceMD);
				messageMD = s.next();
				messageList.add(messageMD);
			}
			mainList.add(nameList);
			mainList.add(allegianceList);
			mainList.add(messageList);
		}
		return mainList;

	}
	
}
