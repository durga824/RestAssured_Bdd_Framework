package commons;

public class HttpStatusCodes {

    public enum HttpStatusCode {
        OK(200),
        CREATED(201),
        BAD_REQUEST(400),
        UNAUTHORIZED(401),
        FORBIDDEN(403),
        NOT_FOUND(404),
        METHOD_NOT_ALLOWED(405),
        INTERNAL_SERVER_ERROR(500),
        UNPROCESSABLE_CONTENT(422);
        private final int code;

        HttpStatusCode(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }
}
