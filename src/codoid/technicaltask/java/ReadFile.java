package codoid.technicaltask.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		File file = new File("path/to/file");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
