package gestionnaire.model;


import java.util.Date;
import java.util.List;

public class Task {
    private String description;
    private Date dueDate;
    private Priority priority;
    private int estimatedDuration; // En jours
    private int progress; // En pourcentage
    private boolean completed; // Pour les tâches booléennes
    private List<Task> subTasks; // Pour les tâches complexes

    // Constructeurs
    public Task(String description, Date dueDate, Priority priority, int estimatedDuration) {
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.estimatedDuration = estimatedDuration;
        this.progress = 0;
        this.completed = false;
        this.subTasks = null;
    }

    // Méthodes pour obtenir et définir les attributs

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public int getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(int estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public List<Task> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<Task> subTasks) {
        this.subTasks = subTasks;
    }
}