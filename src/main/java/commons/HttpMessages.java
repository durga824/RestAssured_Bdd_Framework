package commons;

/*
 * Author: Durga Rao
 * Initial Date: 06/10/2023
 * Description: This class provides all the HTTP messages based on the HTTP status code, the messages from this class are used for validation in the test classes.
 */

public class HttpMessages {

    public enum OK {

        LEAD_DELETED_SUCCESS("Lead deleted successfully");
        private final String successMsg;

        OK(String successMsg){this.successMsg = successMsg;}

        public String getSuccessMsg(){return successMsg;}
    }

    public enum NOT_FOUND {
        URL_NOT_FOUND("The URL you were looking for doesn't exist. You may have mistyped or the URL may have changed"),
        NOT_FOUND_DEFAULT("Not found");

        private final String notFoundMsg;

        NOT_FOUND(String notFoundMsg) {
            this.notFoundMsg = notFoundMsg;
        }

        public String getNotFoundMsg() {
            return notFoundMsg;
        }
    }


}
