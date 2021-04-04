public class StandUpCommand implements Command{
    private TrainingPerson training;

    public StandUpCommand(TrainingPerson training) {
        this.training = training;
    }

    @Override
    public void execute() {
        this.training.standUp();
    }
}
