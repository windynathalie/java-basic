package tugas5_coba.interfaceclass;

import java.util.List;

public interface StudentInterface {

    public void studentRegistration(String fullName, String identityCard);

    public void learningPlan(List<String> courseName, List<Integer> credits, List<String> room);

    public void print();

    public void getSummary();
}
