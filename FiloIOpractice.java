import java.io.*;
import java.io.IOException.*;

public class FiloIOpractice {
    public static void main(String[] args) {
        System.out.println("\n Welcome to java IO!");
        try {
            // Create a file writer, named writer, and open it.
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\BE218\\Desktop\\JavaFiles\\output.txt"));

            // create a file writer and open it.
            writer.write("This is teh first line in my new file!");
            writer.write("\nThis is on a new line!");
            writer.write("\nThis is a string and it is my third line!");

            // close the file.
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
// red file

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\BE218\\Desktop\\JavaFiles\\output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
                reader.close();

        }catch (IOException e){
                e.printStackTrace();
            }


        }
    }

