package use_case.clear_users;


// TODO Complete me

import java.util.ArrayList;
import java.util.List;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary outputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = outputBoundary;
    }

    @Override
    public void execute() {
        try {

            List<String> userDeleted = userDataAccessObject.getUsersDeleted();

            userDataAccessObject.clearAllUsers();

            ClearOutputData clearOutputData = new ClearOutputData(
                    true, // Operation was successful
                    "All users cleared successfully",
                    userDeleted
            );

            clearPresenter.prepareSuccessClearView(clearOutputData);

        } catch (Exception e) {
            ClearOutputData clearOutputData = new ClearOutputData(
                    false,
                    e.getMessage(),
                    new ArrayList<>()
            );
            clearPresenter.prepareFailClearView(clearOutputData.getMessage());
        }
    }
}






