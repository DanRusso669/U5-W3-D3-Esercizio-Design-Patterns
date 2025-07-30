package danrusso.U5_W3_D3_Esercizio_Design_Patterns.adapterEs;

public class UserData {
    private String fullname;
    private int age;

    public UserData(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getData(DataSource ds) {
        fullname = ds.getFullname();
        age = ds.getAge();
    }

    @Override
    public String toString() {
        return "UserData{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }
}
