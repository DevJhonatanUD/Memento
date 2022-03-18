
package memento;
import java.util.ArrayList;

public class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m){
        mementos.add(m);
    }
    public Memento getMemento(int pos){
        return mementos.get(pos);
    }
}

