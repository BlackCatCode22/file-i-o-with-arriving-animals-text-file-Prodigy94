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

        // Open a CSV file using the split() method on a string object
        String path = "C:\\Users\\BE218\\Desktop\\JavaFiles\\arrivingAnimals.txt";
        String myFileLine = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((myFileLine = reader.readLine()) != null) {
                String[] myArray = myFileLine.split(",");
                System.out.println("First item: " + myArray[0]);
                System.out.println("Second item: " + myArray[1]);
                System.out.println("Third item: " + myArray[2]);
                System.out.println("Fourth item: " + myArray[3]);
                System.out.println("Fifth item: " + myArray[4]);
                System.out.println("Sixth item: " + myArray[5]);
            }
        }catch(IOException e){
                e.printStackTrace();
            }
        }


        }


