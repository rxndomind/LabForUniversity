import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Students {
    Map<Integer, Student> studentList = new HashMap<>();

    public List<Student> getStudents() {
        return new ArrayList<>(studentList.values());
    }

    public Students(String filePathStud, String filePathGrade) {
        List<String> data = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePathStud));
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.studentList = mapPerson(data);

        List<String> lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePathGrade));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(int i = 1; i < lines.size(); i++) {
            String[] line = lines.get(i).split(",");
            studentList.get(Integer.parseInt(line[0])).getGrade().addGrade(Integer.parseInt(line[1]));
        }
    }

    private Map<Integer, Student> mapPerson(List<String> lines){
        Map<Integer, Student> persons = new HashMap<>();
        for(int i = 1; i < lines.size(); i++) {
            String[] line = lines.get(i).split(",");
            persons.put(Integer.parseInt(line[0]), new Student(Integer.parseInt(line[0]), line[1], line[2], new Grade()));
        }
        return persons;
    }

}