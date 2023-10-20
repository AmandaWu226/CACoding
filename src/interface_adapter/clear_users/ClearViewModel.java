package interface_adapter.clear_users;
import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// TODO Complete me

public class ClearViewModel extends ViewModel {

    public static final String TITLE_LABEL = "Clear Users View";
    public static final String CLEAR_USERS_BUTTON_LABEL = "Clear All Users";
    public static final String CANCEL_BUTTON_LABEL = "Cancel";

    private ClearState state = new ClearState();

    public ClearViewModel() {
        super("clear users");
    }

    public void setState(ClearState state) {
        this.state = state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() {
        return state;
    }
}