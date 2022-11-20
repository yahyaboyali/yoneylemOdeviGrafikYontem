public class ErrorResult extends Result{
    public ErrorResult(ResultOfDenklem resultOfDenklem, String message) {
        super(resultOfDenklem, message, false);
    }

    public ErrorResult(String message) {
        super(message, false);
    }

    public ErrorResult() {
        super(false);
    }
}
