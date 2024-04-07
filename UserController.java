package Seminar_10.HW;

public interface UserController<T extends User> {

    void create (String firstName, String lastName, String middleName);
}
