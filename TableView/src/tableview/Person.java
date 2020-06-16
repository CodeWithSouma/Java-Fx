
package tableview;


public class Person {
    private String name;
    private int ID;
    private float salary;

    Person(String name, int ID, float salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
    
    
}
