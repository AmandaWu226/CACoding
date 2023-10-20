package interface_adapter.clear_users;
import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearUserDataAccessInterface;

import java.util.List;


// TODO Complete me
public class ClearController {
    final ClearInputBoundary userClearUseCaseInteractor;
    final ClearUserDataAccessInterface clearUserDataAccess;

    public ClearController(ClearInputBoundary userClearUseCaseInteractor, ClearUserDataAccessInterface clearUserDataAccess) {
        this.userClearUseCaseInteractor = userClearUseCaseInteractor;
        this.clearUserDataAccess = clearUserDataAccess;
    }

    public void execute() {
        userClearUseCaseInteractor.execute();
    }

    public List<String> getDeletedUsers() {
        return clearUserDataAccess.getUsersDeleted();
    }



}
