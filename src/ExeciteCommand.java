public class ExeciteCommand  implements Command{
    private TrainingPerson training;
    private ExersiseFactory exersise;

    public ExeciteCommand(TrainingPerson training, ExersiseFactory exersise) {
        this.training = training;
        this.exersise = exersise;
    }

    @Override
    public void execute() {
        this.training.setExersise(this.exersise);
    }
}
