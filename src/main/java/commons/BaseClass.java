package commons;

/*
 * Author: Durga Rao
 * Initial Date: 06/10/2023
 * Description:This class holds the basic re-usable methods required for writing the tests.
 */

import io.restassured.response.Response;
import org.junit.Assert;

public class BaseClass {

    public void verifyResponse(
            Response response, String methodName, String className, String httpErrorMsg, int httpCode) {
        try {
            Assert.assertEquals(response.statusCode(), httpCode);
            Assert.assertTrue(response.asString().contains(httpErrorMsg));
        } catch (AssertionError error) {
            Assert.fail(error.getMessage());

        }
    }
}
