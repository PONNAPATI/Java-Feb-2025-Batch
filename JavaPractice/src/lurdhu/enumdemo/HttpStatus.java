package src.lurdhu.enumdemo;

public enum HttpStatus {
    OK(200, "Operation is successful"),
    FAIL(400, "Operation has failed");

    private int code;
    private String message;
    HttpStatus(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
