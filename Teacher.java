package Seminar_10.HW;

public class Teacher extends User implements Comparable<Teacher> {

    public Teacher(String firstName, String lastname, String middleName) {
        super(firstName, lastname, middleName);

    }

    private Long teacherId;

    public Long getTeacherId() {
        return this.teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(teacherId);
    }

}
