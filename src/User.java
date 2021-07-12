public class User extends FirstNameLastName {
    protected boolean isAdmin;

    public User(String firstName, String lastName, boolean isAdmin){
        super(firstName, lastName);
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
