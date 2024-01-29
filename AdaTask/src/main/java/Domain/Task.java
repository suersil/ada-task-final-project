package Domain;

public interface Task {

    //Getters e Setters:
    String getTitle();
    String getDescription();
    String getDeadline();

    void setTitle(String title);
    void setDescription(String description);
    void setDeadline(String deadline);
}
