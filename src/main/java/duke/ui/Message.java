package duke.ui;

import duke.task.Task;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public final class Message implements PropertyChangeListener {
    public Message() { }

    /*
    echo prints out the String parameter passed to it
     */
    public static void echo(String input) {
        System.out.print("\t");
        System.out.println(input);
    }

    public static void addTask(String input) {
        System.out.print("\tadded:");
        echo(input);
    }

    public static void emptyList() {
        System.out.println("\t Zero task, add something new!");
    }

    public static void exit() {
        System.out.println("\n👋 Bye, see ya ~ \n");
    }

    public static String exceptionUnknownCommand() {
        return "X_X : Unknown command, please try again";
    }

    public static String exceptionNumArgs() {
        return "X_X : Wrong number of argument, please try again";
    }

    public static String exceptionInvalidArgs() {
        return "X_X : Contains invalid argument, please try again";
    }

    public static String exceptionNoDate() {
        return "X_X : Please give a proper date for this type of task, please try again";
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        var list = (ArrayList<Task>) evt.getNewValue();
        String title = list.get(list.size() - 1).getTitle();
        this.addTask(title);
        echo("Now " + list.size() + " tasks in Total");
    }

    public static void greeting() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("👋 from\n" + logo);

        System.out.println("You may spell your wish 🧞‍ \n");
    }
}
