package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
public class GreetingController {

    private Map<String, Car> cars;
    public GreetingController(){
        cars = new HashMap<String, Car>();
        cars.put("nano", new Car(1,"Nano","TATA",165000));
        cars.put("tavera", new Car(2, "Tavera", "Chervolet", 865000));
        cars.put("scorpio", new Car(2, "Scorpio", "Mahindra", 870000));
    }
    @GET
    @GetMapping("/testget")
    @Produces (MediaType.APPLICATION_JSON)
    public Car getCarDetailsByName(String name) {
        String newName = "nano";
        if (cars.containsKey(newName)) {


            System.out.println(newName);
            return cars.get(newName);
        } else {
            throw new CarNotFoundException(
                    "Car with name = " + newName + " not found.");
        }
    }

}