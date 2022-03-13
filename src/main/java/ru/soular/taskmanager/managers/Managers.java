package ru.soular.taskmanager.managers;

public class Managers {

    public static ITaskManager getDefault() {
        return InMemoryTaskManager.getInstance();
    }

    public static IHistoryManager getDefaultHistory() {
        return InMemoryHistoryManager.getInstance();
    }
}
