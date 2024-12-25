public class Main {
    public static void main(String[] args) {
        Students students = new Students("D:\\java\\Lab8\\src\\students.csv", "D:\\java\\Lab8\\src\\grades.csv");
        for (Student student : students.getStudents()) {
            System.out.println(student);
        }
        System.out.println("----------------");
        for (Student student : students.getStudents()) {
            System.out.println(student+ " " + student.getGrade().getAverage().toString());
        }
        System.out.println("----------------");
        for (Student student : students.getStudents()) {
            if ( 4.3 <= student.getGrade().getAverage() && student.getGrade().getAverage() <= 4.7){
                System.out.println(student+ " " + student.getGrade().getAverage().toString());
            }
        }

    }
}