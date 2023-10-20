package use_case.clear_users;

// TODO Complete me

public interface ClearOutputBoundary {
    void prepareSuccessClearView(ClearOutputData response);
    void prepareFailClearView(String error);
}
