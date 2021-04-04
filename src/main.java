public class main {
    public static void main(String[] args) {
        TrainingPerson training = new TrainingPerson();
        Trainer trainer = new Trainer();
        Observer obs1 = new Spectator("Spectator 01");
        Observer obs2 = new Spectator("Spectator 02");
        Observer obs3 = new Spectator("Spectator 03");
        ExersiseFactory standUpExersise = new ExersiseFactory("Stand up!");
        ExersiseFactory lieDownExersise = new ExersiseFactory("Lie donw!");
        Command standUp = new ExeciteCommand(training, standUpExersise);
        Command lieDown = new ExeciteCommand(training, lieDownExersise);

        training.subscribe(obs1);
        training.subscribe(obs2);
        training.subscribe(obs3);

        trainer.setCommand(standUp);
        trainer.setNewExersise();

        trainer.setCommand(lieDown);
        trainer.setNewExersise();
    }
}
