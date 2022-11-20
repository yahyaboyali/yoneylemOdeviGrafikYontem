public class SuccessResult extends Result{

    public SuccessResult(ResultOfDenklem resultOfDenklem, String message) {
        super(resultOfDenklem, message, true);
    }

    public SuccessResult(String message) {
        super(message, true);
    }
    public SuccessResult() {
        super(true);
    }
}
