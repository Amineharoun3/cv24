package ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import gestionnaire.model.Task;

public class TaskAnalyzer {
    // Méthode pour lire une liste de tâches à partir d'un fichier
    public List<Task> readTasksFromFile(String filePath) throws IOException {
        List<Task> tasks = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Parser les lignes du fichier et créer des objets Task
                // Ajouter les tâches à la liste
            }
        }
        return tasks;
    }

    // Méthode pour extraire les tâches les plus importantes
    public List<Task> extractImportantTasks(List<Task> tasks, int numTasksToExtract) {
        // Filtrer les tâches non complétées
        List<Task> incompleteTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                incompleteTasks.add(task);
            }
        }
        // Trier les tâches par date d'échéance croissante et par priorité décroissante
        incompleteTasks.sort(Comparator.comparing(Task::getDueDate).thenComparing(Task::getPriority));
        // Extraire les N premières tâches
        int numTasks = Math.min(numTasksToExtract, incompleteTasks.size());
        return incompleteTasks.subList(0, numTasks);
    }
}
