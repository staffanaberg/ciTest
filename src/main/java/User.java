public class User {

    private String password;
    private String name;
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = "Sven";
    }

}
