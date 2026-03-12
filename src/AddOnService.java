import java.util.ArrayList;
import java.util.List;

public class AddOnService {

    private List<String> services = new ArrayList<>();

    public void addService(String service) {
        services.add(service);
    }

    public void showServices() {
        System.out.println("\nSelected Add-On Services:");
        for(String s : services) {
            System.out.println("- " + s);
        }
    }
}