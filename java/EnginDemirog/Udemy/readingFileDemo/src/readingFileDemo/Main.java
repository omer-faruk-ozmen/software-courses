package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = null;
		int total = 0;
		try {
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\OFO\\Desktop\\Desktop\\software\\java\\EnginDemirog\\Udemy\\readingFileDemo\\src\\sayilar.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				total += Integer.valueOf(line);
			}
			System.out.println("Toplam = " + total);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
