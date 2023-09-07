import java.io.*;

public class FileIOwithCSV {
    public static void main(String[] args) throws IOException {

        String file = "C:\\Users\\BE218\\Desktop\\JavaProject\\arrivingAnimals.txt";
        String pathOutput = "C:\\Users\\BE218\\Desktop\\JavaProject\\myNewFile.txt";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){

                String[] row = line.split(",");

                for(String i : row){
                    System.out.println("\n" + i);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // Write to a file named: myNewFile.txt

            // Create a file writer.
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathOutput));

            try {
                writer.write("This  is a line of animals...");
                // write to our file with a for loop
                for (int i=0; i<10; i++){
                    writer.write("\n i is: " + i);
                }
            }

            catch(IOException e){
                e.printStackTrace();
            }

            finally{
                writer.close();
            }


        }
        }
    }

