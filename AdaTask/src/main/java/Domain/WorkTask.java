package Domain;

public class WorkTask extends BaseTask{
    public WorkTask(String title, String description, String deadline) {
        super(title, description, deadline);
    }

    @Override
    public String toString() {
        return "Work Task - "+ super.toString();
    }
}
