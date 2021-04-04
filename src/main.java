public class main {
    public static void main(String[] args) {
        TrainingPerson training = new TrainingPerson();
        Trainer trainer = new Trainer();
        Observer obs1 = new Spectator("Spectator 01");
        Observer obs2 = new Spectator("Spectator 02");
        Observer obs3 = new Spectator("Spectator 03");
        Command standUp = new StandUpCommand(training);
        Command lieDown = new LieDownCommand(training);
//        ExersiseFactory standUp = new ExersiseFactory("Stand up!");
//        ExersiseFactory lieDown = new ExersiseFactory("Lie down!");

        training.subscribe(obs1);
        training.subscribe(obs2);
        training.subscribe(obs3);

        trainer.setCommand(standUp);
        trainer.setNewExersise();

        trainer.setCommand(lieDown);
        trainer.setNewExersise();

//        training.setExersise();
    }
}
