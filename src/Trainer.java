public class Trainer {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void setNewExersise() {
        System.out.println("Executing command");
        this.command.execute();
    }
}
