package use_case.clear_users;

// TODO Complete me

import java.util.List;

public class ClearOutputData {
    private final boolean isSuccessful;
    private final String message;
    private final List<String> userDeleted;

    public ClearOutputData(boolean isSuccessful, String message, List<String> userDeleted) {
        this.isSuccessful = isSuccessful;
        this.message = message;
        this.userDeleted = userDeleted;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getUserDeleted() {
        return userDeleted;
    }
}
