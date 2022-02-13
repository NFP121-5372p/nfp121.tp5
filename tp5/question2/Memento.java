package question2;
import java.util.List;


/**
 * Write a description of class Memento here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Memento
{private final List<String> state;

    public Memento(List<String> stateToSave) {
        state = stateToSave;
    }

    public List<String> getSavedState() {
        return state;
    }
}
