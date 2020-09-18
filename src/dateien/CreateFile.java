package dateien;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;


public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanObj = new Scanner(System.in);
		
		System.out.println("Geben Sie einen Namen für die neue Datei ein: ( mit .txt Endung)");
		
		String keyboard = scanObj.next();
		
		try {
			
			File myObj = new File("C:\\Users\\Stephan\\Desktop\\"+ keyboard);
		
			myObj.createNewFile();
		
			System.out.println("Die neue Datei heisst: "+ myObj.getName());
			
			System.out.println("Die Datei ist "+ myObj.length() +" bytes gross. ");
			
			System.out.println("Schreiben Sie nun einen Text in das Textfile: ");
			
			FileWriter myWriter = new FileWriter("C:\\Users\\Stephan\\Desktop\\"+ myObj.getName());
			
			String text = scanObj.next();
			
			myWriter.write(text);
			myWriter.close();
			
			System.out.println("Datei wurde erfolgreich beschrieben. ");
		
		} catch (IOException e) {
			System.out.println("Ein Error ist erschienen. ");
		}
				
		scanObj.close();

	}

}
