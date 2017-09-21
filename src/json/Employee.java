package json;

public class Employee {

    private int id;
    private String name;
    private boolean permanent;

    public Employee() {
    }

    public Employee(int id, String name, boolean permanent) {

        this.id = id;
        this.name = name;
        this.permanent = permanent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permanent=" + permanent +
                '}';
    }
}
