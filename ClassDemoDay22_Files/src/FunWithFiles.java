import java.io.*;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FunWithFiles {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello");
		// create a folder out a c:\ if it doesn't exist
    String dirString = "c:/bootcamp/files";
    Path dirPath = Paths.get(dirString);
    if(Files.notExists(dirPath)) {
    	Files.createDirectories(dirPath);
    }
	//create a file in this new folder
    String fileString = "stuffiest.txt";
    Path filePath = Paths.get(dirString, fileString);
    if( Files.notExists(filePath)) {
    	Files.createFile(filePath);
    }
    
    //display the folder structure
    if(Files.exists(dirPath)&& Files.isDirectory(dirPath)){
    	System.out.println("Directory: "+ dirPath.toAbsolutePath());
    	System.out.println("Files: ");
    	DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
    	for (Path p: dirStream) {
    		if (Files.isRegularFile(p))
    			System.out.println("\t"+p.getFileName());
    	}
    	
    }
//	//write to the file
       File stuffiesFile = filePath.toFile();
//    PrintWriter out = new PrintWriter(
//    		          new BufferedWriter(
//    		          new FileWriter(stuffiesFile)));
//    out.println("1\tBear\tLarge\tRed");
//    out.println("2\tCat\tSmall\tPink");
//    out.println("3\tDog\tMedium\tBlue");
//    
//    out.close();
    //read from the file
    BufferedReader in = new BufferedReader(
    		           new FileReader(stuffiesFile));
    
    String line = in.readLine();
    ArrayList<Stuffy> stuffies = new ArrayList<>();
    
    System.out.println(line);
    while( line!=null) {
    	String[] fields = line.split("\t");
    	int id = Integer.parseInt(fields[0]);
    	String type = fields[1];
    	String size = fields[2];
    	String color = fields[3];
    	
    	Stuffy s = new Stuffy ( id,  type, size,  color);
    	stuffies.add(s);
    	System.out.println(line);
    	line = in.readLine();
    }
    
    in.close();
    //process the list of stuffies
    System.out.println("List of stuffies from file: ");
    for(Stuffy s: stuffies) {
    	System.out.println(s);
    }
    
    
		System.out.println("Bye");

	}

}
