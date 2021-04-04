import java.util.ArrayList;
import java.util.List;

public class TrainingPerson implements Observable{

    private List<Observer> observers = new ArrayList<>();
    private String training;

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setExcersise(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        // Can be something more than just a getter
        return this.training;
    }

    public void setExersise(ExersiseFactory training) {
        this.training = training.getName();
        this.notifyObservers();
    }
}
