public class Result {
    private ResultOfDenklem resultOfDenklem;
    private String message;
    private boolean status;

    public Result(ResultOfDenklem resultOfDenklem, String message, boolean status) {
        this.resultOfDenklem = resultOfDenklem;
        this.message = message;
        this.status = status;
    }

    public Result(String message, boolean status) {
        this.message = message;
        this.status = status;
    }

    public Result(boolean status) {
        this.status = status;
    }

    public ResultOfDenklem getResultOfDenklem() {
        return resultOfDenklem;
    }

    public void setResultOfDenklem(ResultOfDenklem resultOfDenklem) {
        this.resultOfDenklem = resultOfDenklem;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
