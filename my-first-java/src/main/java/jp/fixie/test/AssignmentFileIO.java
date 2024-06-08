package jp.fixie.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class AssignmentFileIO {

	// ファイル入出力
	// 小問1

	public static void main(String[] args) {
		System.out.println("ファイル入出力-小問1");
		// Declare a List<String> variable and initialize
		List<String> list = Arrays.asList("Java", "研修", "ファイル入出力");

		// Declare a File variable and initialize
		File file = new File("C:/work/小問1.txt");

		// Use try-with-resource for file operations
		try (FileWriter fw = new FileWriter(file, false);
				BufferedWriter bw = new BufferedWriter(fw);
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr)) {

			// Loop list elements and write them to file
			for (String element : list) {
				// Output
				System.out.println("出力内容 : " + element);

				// Write element
				bw.write(element);

				// Write a newline character
				bw.newLine();
			}

			// Use flush to ensure all data is written
			bw.flush();

			// Read from file and output
			String line;
			while ((line = br.readLine()) != null) {
				// Output
				System.out.println("入力内容 : " + line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
