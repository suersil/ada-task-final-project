package Domain;

public class BaseTask implements Task {

    //Atributos
    private String title;
    private String description;
    private String deadline;

    //Construtor
    public BaseTask(String title, String description, String deadline) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
    }

    // Getters e Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDeadline() {
        return deadline;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Description: " + description + ", Deadline: " + deadline;
    }
}

