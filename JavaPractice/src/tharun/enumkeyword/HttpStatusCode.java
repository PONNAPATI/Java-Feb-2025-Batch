package tharun.enumkeyword;

public enum HttpStatusCode {
    OK(200, "ok"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatusCode(int code, String message){
        this.code = code;
        this.message =  message;
    }

    public int getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }

    public static void main(String[] args) {
        System.out.println(HttpStatusCode.NOT_FOUND.getCode());
        System.out.println(HttpStatusCode.OK.getMessage());
    }
}
