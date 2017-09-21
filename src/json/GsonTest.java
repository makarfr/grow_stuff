package json;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class GsonTest {

    public static void main(String[] args) {
        toJava();
        toJson();
    }

    private static void toJson() {
        Gson gson = new Gson();
        Employee kevin = new Employee(7, "Kevin", false);
        String jsonInString = gson.toJson(kevin);
        System.out.println(jsonInString);
    }

    private static void toJava() {
        Gson gson = new Gson();
        try {
            Employee staff = gson.fromJson(new FileReader("C:\\Users\\Olga_Kovalenko1\\Documents\\own_projects\\grow_stuff\\src\\json\\test.json"), Employee.class);
            System.out.println(staff);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
