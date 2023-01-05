package Exam.TryExample;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    UserType getUserType() {
        return UserType.ADMIN;
    }

    @Override
    public String toString() {
        return "Admin{}" + super.toString();
    }
}
