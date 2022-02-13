package question2;
import java.util.Stack;


/**
 * Write a description of class Caretaker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Caretaker
{
     private Stack<Memento> savedStates = new Stack<Memento>();

    public void addMemento(Memento m) {
        savedStates.push(m);
    }

    public Memento getMemento() {
        return savedStates.pop();
    }

    public Memento seeMemento() {
        return savedStates.peek();
    }

    public boolean isEmpty(){
        return savedStates.empty();
    }
}
