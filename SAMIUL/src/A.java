import java.io.*;
import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		try {
			
			File myObj=new File("MyFile.txt");
			if(myObj.createNewFile()) {
				System.out.println("File created: "+myObj.getName());
			}else {
				System.out.println("File already exists.");
			}
			
			FileWriter myWriter =new FileWriter("MyFile.txt");
			myWriter.write("Hello");
			myWriter.close();
			
			File fileOb=new File("MyFile.txt");
			Scanner scan=new Scanner(fileOb);
			while(scan.hasNextLine()) {
				String data=scan.nextLine();
				System.out.println(data);
			}
			scan.close();
			System.out.println("Successfully wrote to the file.");
		
		}
		catch(IOException e)
		{
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}