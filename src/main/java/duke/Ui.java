package duke;

import duke.tasks.Task;

import java.util.ArrayList;
import java.util.Scanner;


public class Ui implements java.io.Serializable {
    public static final String LINE_SEPARATOR = "____________________________________________________________";
    private static Scanner in;

    public Ui() {
        in = new Scanner(System.in);
    }

    public static void printSeparator() {
        System.out.println(LINE_SEPARATOR);
    }

    public static String getInput() {
        String input = in.nextLine();
        return input;
    }

    public static void greet() {
        printSeparator();
        System.out.println(" Hello! I'm Duke\n" + " What can I do for you?");
        printSeparator();
        System.out.println("");
    }

    public static void farewell() {
        printSeparator();
        System.out.println(" Bye. Hope to see you again soon!");
        printSeparator();
    }

    public static void displayList(ArrayList<Task> tasks) {
        System.out.println(" Here are the tasks in your list:");
        for (int i = 0; i < tasks.size(); i += 1) {
            // print index of task
            System.out.print(" " + (i + 1) + ".");

            // list the details about the task. Based on whether the task is ToDo, Deadline or Event.
            System.out.println(tasks.get(i));
        }
    }

    public void printSuccessfulAddMessage(Task currTask, ArrayList<Task> tasks) {
        System.out.println(" Got it. I've added this task: ");
        System.out.println("  " + currTask);
        System.out.println(" Now you have " + tasks.size() + " tasks in the list.");

    }

    public static void printValidSave() {
        System.out.println("Valid save file detected.");
    }

    public static void printSuccessfulSave(String filepath) {
        System.out.println("File successfully saved to: " + filepath);
    }

    public static void printSuccessfulMark(Task markedTask) {
        System.out.println(" Nice! I've marked this task as done:");
        System.out.println("   " + markedTask.taskTypeBoxFormat() + markedTask.markedBoxFormat() + " "
                + markedTask.getTaskName());
    }

    public static void printSuccessfulUnmark(Task unmarkedTask) {
        System.out.println(" OK, I've marked this task as not done yet:");
        System.out.println("   " + unmarkedTask.taskTypeBoxFormat() + unmarkedTask.markedBoxFormat() + " "
                + unmarkedTask.getTaskName());
    }

    public static void printSuccessfulDelete(Task deletedTask, int numTasks) {
        System.out.println(" Noted. I've removed this task:");
        System.out.println("   " + deletedTask.taskTypeBoxFormat() + deletedTask.markedBoxFormat() +
                " " + deletedTask.getTaskName());
        System.out.println(" Now you have " + numTasks + " tasks in the list.");
    }

    public static void printFilteredList(ArrayList<Task> filteredList) {
        System.out.println(" Here are the matching tasks in your list:");

        for (int i = 0; i < filteredList.size(); i += 1) {
            // print index of task
            System.out.print(" " + (i + 1) + ".");

            // list the details about the task. Based on whether the task is ToDo, Deadline or Event.
            System.out.println(filteredList.get(i));
        }
    }

    public static void printFilteredListEmpty() {
        System.out.println(" There are no matching tasks!");
    }

    public static void printInvalidIndex() {
        System.out.println("Given index is invalid!");
    }

    public static void printIndexNotNumber() {
        System.out.println("Given index is not a number!");
    }

    public static void printNoValidSaveIOException() {
        System.out.println("IOException caught, no valid save file detected. Starting with " +
                "empty list.");
    }

    public static void printNoValidSaveClassNotFound() {
        System.out.println("ClassNotFoundException caught, no valid save file detected. Starting with " +
                "empty list.");
    }

    public static void printInvalidCommandException() {
        System.out.println("Invalid command!");
    }

    public static void printFailedToSave() {
        System.out.println("IOException caught, failed to save.");
    }

    public static void printTodoEmptyDescription() {
        System.out.println("Invalid todo command! Task description cannot be empty");
    }

    public static void printDeadlineEmptyDescription() {
        System.out.println("Invalid deadline command! Task description cannot be empty");
    }

    public static void printInvalidDeadline() {
        System.out.println("Invalid deadline command!");
    }

    public static void printEventEmptyDescription() {
        System.out.println("Invalid event command! Task description cannot be empty");
    }

    public static void printInvalidEvent() {
        System.out.println("Invalid event command!");
    }

}