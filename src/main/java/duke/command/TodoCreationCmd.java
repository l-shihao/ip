package duke.command;

import duke.exception.NumArgsException;
import duke.parse.StringParser;
import duke.storage.TempTaskList;
import duke.task.*;
import duke.ui.Message;

public class TodoCreationCmd implements UndoableCommand{
    // Task is a Receiver Class in this Command
    private TempTaskList list;
    private Task task;

    public TodoCreationCmd( TempTaskList list) {
        this.list = list;
    }

    @Override
    public void run(String[] args) {
        String arg = StringParser.join(args);
        if(args.length == 0) {
            try {
                throw new NumArgsException();
            } catch (NumArgsException e) {
                Message.echo(e.getMessage());
            }
        } else {
            list.add(new Todo(arg));
        }
    }

    @Override
    public void undo() {
        task.markUnDone();
    }

    @Override
    public void redo() {

    }
}
