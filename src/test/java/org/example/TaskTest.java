package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void simpleTaskFound() {
        SimpleTask simpleTask = new SimpleTask(7, "Сходить в спортзал");

        boolean actual = simpleTask.matches("Сходить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void simpleTaskNotFound() {
        SimpleTask simpleTask = new SimpleTask(7, "Сходить в спортзал");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void epicFound() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Яйца");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void epicNotFound() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Масло");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void meetingFound() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Приложение");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void meetingNotFound() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("АбсолютБанка");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);

    }

}