package duke;

import javafx.application.Application;

/**
 * A launcher class to workaround classpath issues.
 */
public class Launcher {
    /**
     * program entrance
     * @param args
     */
    public static void main(String[] args) {
        Application.launch(Duke.class, args);
    }
}

