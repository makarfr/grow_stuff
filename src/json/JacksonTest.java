package json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonTest {

    public static void main(String args[]) {
        toJava(); // converting Java object to JSON String
        toJSON(); // parsing JSON file to create Java object

    }

    private static void toJava() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            File json = new File("src\\json\\test.json");
            System.out.println(json.getAbsolutePath());
            Employee cricketer = mapper.readValue(json, Employee.class);
            System.out.println("Java object created from JSON String :");
            System.out.println(cricketer);
        } catch (JsonGenerationException ex) {
            ex.printStackTrace();
        } catch (JsonMappingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void toJSON() {
        Employee kevin = new Employee(7, "Kevin", false); // our bridge from Java to JSON and vice versa
        ObjectMapper mapper = new ObjectMapper();
        try {
            File json = new File("src\\json\\employee.json");
            mapper.writeValue(json, kevin);
            System.out.println("Java object converted to JSON String, written to file");
            System.out.println(mapper.writeValueAsString(kevin));
        } catch (JsonGenerationException ex) {
            ex.printStackTrace();
        } catch (JsonMappingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}