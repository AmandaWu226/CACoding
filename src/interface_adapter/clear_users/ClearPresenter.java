package interface_adapter.clear_users;
import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

// TODO Complete me

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessClearView(ClearOutputData response) {
        ClearState clearState = clearViewModel.getState();
        clearState.setClearSuccessful(true);
        clearState.setErrorMessage(null);
        clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();
    }

    @Override
    public void prepareFailClearView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setClearSuccessful(false);
        clearState.setErrorMessage(error);
        clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();

    }
}
