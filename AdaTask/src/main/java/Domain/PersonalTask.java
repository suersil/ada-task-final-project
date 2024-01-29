package Domain;

public class PersonalTask extends BaseTask{
    public PersonalTask(String title, String description, String deadline) {
        super(title, description, deadline);
    }
    @Override
    public String toString() {
        return "Personal Task - "+ super.toString();
    }
}
