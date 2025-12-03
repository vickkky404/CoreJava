import java.io.*;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";
        String content = "Hello, Java!";
        
        // Write to file
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(content);
            System.out.println("File written successfully");
        }
        
        // Read from file
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File contents:");
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        
        // File exists check
        File file = new File(fileName);
        if(file.exists()) {
            System.out.println("File exists");
            System.out.println("File size: " + file.length());
        }
    }
}
