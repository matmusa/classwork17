public class Employee extends Person {
    private int id;

    public Employee(String name, char gender, int id) {
        super(name, gender);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void work() {
        if (id == 1) {
            System.out.println("working");
        } else {
            System.out.println("doesnt work ");

        }
    }
}
