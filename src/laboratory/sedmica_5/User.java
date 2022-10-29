package laboratory.sedmica_5;

public class User implements IValidater {
    private String username;
    private String password;

    public User(String username, String pass) throws EmailException {
            this.username = username;
            this.password = pass;
            check();
    }

    @Override
    public void check() throws EmailException {
        if (this.username.endsWith("@abv.bg")) {
        } else throw new EmailException("Incorrect email address");
    }

    public static void main(String[] args) {
        try {
            User user = new User("gosho@abv.bg", "1234");
            System.out.println(user.username);
            User user2 = new User("dre", "12432");
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}
