
package studentmanagement;


public class Student {
    
    private String name;
    private String email;
    private String stream;
    private String address;

    public Student(String name, String email, String stream, String address) {
        this.name = name;
        this.email = email;
        this.stream = stream;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + ", stream=" + stream + ", address=" + address + '}';
    }
    
    
    
    
}
