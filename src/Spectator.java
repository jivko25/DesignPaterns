public class Spectator implements Observer{

    private String name;
    private Observable excersise;

    public Spectator(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if(this.excersise == null) {
            System.out.println(this.name + " has no exersise set");
            return;
        }
        String newExersise = this.excersise.getUpdate();
        System.out.println(this.name + " updated with " + newExersise);
    }

    @Override
    public void setExcersise(Observable excersise) {
        this.excersise = excersise;
    }
}
