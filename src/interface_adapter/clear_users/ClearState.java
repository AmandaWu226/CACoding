package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private boolean clearSuccessful = false;
    private String errorMessage = null;
    public ClearState(ClearState copy) {
        clearSuccessful = copy.clearSuccessful;
        errorMessage = copy.errorMessage;
    }

    public ClearState() {
    }

    public boolean isClearSuccessful() {
        return clearSuccessful;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setClearSuccessful(boolean clearSuccessful) {
        this.clearSuccessful = clearSuccessful;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "ClearState{" +
                "clearSuccessful=" + clearSuccessful +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
