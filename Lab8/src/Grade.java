import java.util.ArrayList;
import java.util.List;

public class Grade {
    List<Integer> grade = new ArrayList<Integer>();

    public List<Integer> getGrade(){
        return this.grade;
    }

    public void setGrade(List<Integer> grade){
        this.grade = grade;
    }

    public void addGrade(int grade){
        this.grade.add(grade);
    }

    public Float getAverage(){
        int sum = 0;

        for (int number : grade) {
            sum += number;
        }

        return (float) sum / grade.size();
    }

}