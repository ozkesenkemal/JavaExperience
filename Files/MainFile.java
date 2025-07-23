import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Files\\students.txt");

		try {
			getFileInfo();
			readFile();
			writeFile();
			readFile();
			if (!file.exists()) {
				file.createNewFile();
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getFileInfo() {
		File file = new File("C:\\Files\\students.txt");

		if (file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.canWrite());
			System.out.println(file.canRead());
			System.out.println(file.length());
		}
	}

	public static void readFile() {
		File file = new File("C:\\Files\\students.txt");
		try {
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeFile() {
		try {
			FileWriter writer = new FileWriter("C:\\\\Files\\\\students.txt", true);
			writer.write("ekleme");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
