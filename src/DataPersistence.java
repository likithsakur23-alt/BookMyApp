import java.io.FileWriter;
import java.io.IOException;

public class DataPersistence {

    public void saveData(String data) {

        try {
            FileWriter writer = new FileWriter("booking_data.txt", true);
            writer.write(data + "\n");
            writer.close();

            System.out.println("Data saved successfully.");

        } catch(IOException e) {
            System.out.println("Error saving data.");
        }
    }
}