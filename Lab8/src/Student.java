public class Student {
    private int id;
    private String first_name;
    private String last_name;
    private Grade grade;

    Student(int id, String first_name, String last_name, Grade grade) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFull_name() {
        return first_name +" "+ last_name;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", grade=" + grade.getGrade() + "]";
    }
}
