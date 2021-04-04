public class LieDownCommand implements Command{
    private TrainingPerson training;

    public LieDownCommand(TrainingPerson training) {
        this.training = training;
    }

    @Override
    public void execute() {
        this.training.lieDown();
    }
}
