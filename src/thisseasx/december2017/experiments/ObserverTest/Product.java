package thisseasx.december2017.experiments.ObserverTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

class Product extends Observable {

    private List<Observer> observers = new ArrayList<>();
    private String productName;
    private String productType;
    private boolean available;

    Product(String productName, String productType, boolean available) {
        super();
        this.productName = productName;
        this.productType = productType;
        this.available = available;
    }

    void setAvailable(boolean available) {
        if (this.available != available) {
            this.available = available;
            setChanged();
            notifyObservers();
        }
    }

    @Override
    public void notifyObservers(Object arg) {
        System.out.println("Notifying to all the subscribers when product became available");
        for (Observer o : observers) {
            o.update(this, available);
        }
    }

    @Override
    public String toString() {
        return productName;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public synchronized void deleteObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public synchronized void deleteObservers() {
        observers.clear();
    }
}
