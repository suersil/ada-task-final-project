package Domain;

public class StudyTask extends BaseTask{
    public StudyTask(String title, String description, String deadline) {
        super(title, description, deadline);
    }

    @Override
    public String toString() {
        return "Study Task - "+ super.toString();
    }
}
