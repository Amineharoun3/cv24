package ui;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import gestionnaire.model.Priority;
import gestionnaire.model.Task;

public class taskEditor {
    private List<Task> taskList;

    public taskEditor() {
        this.taskList = new ArrayList<>();
    }

    // Méthode pour créer une nouvelle tâche
    public void createTask(String description, Date dueDate, Priority priority, int estimatedDuration) {
        Task newTask = new Task(description, dueDate, priority, estimatedDuration);
        taskList.add(newTask);
    }

    // Méthode pour modifier une tâche existante
    public void updateTask(Task taskToUpdate, String newDescription, Date newDueDate, Priority newPriority, int newEstimatedDuration) {
        taskToUpdate.setDescription(newDescription);
        taskToUpdate.setDueDate(newDueDate);
        taskToUpdate.setPriority(newPriority);
        taskToUpdate.setEstimatedDuration(newEstimatedDuration);
    }

    // Méthode pour supprimer une tâche de la liste
    public void deleteTask(Task taskToDelete) {
        taskList.remove(taskToDelete);
    }

    // Méthode pour récupérer la liste des tâches
    public List<Task> getTaskList() {
        return taskList;
    }
}