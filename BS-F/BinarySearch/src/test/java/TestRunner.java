import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(RegressionTest.class);

        if (result.getFailures() != null) {
            for (Failure failure : result.getFailures()) {
                if (failure != null && failure.getException() != null) {
                    System.out.println(failure.toString());
                } else {
                    System.out.println("Encountered a failure with null exception.");
                }
            }
        }

        if (result.wasSuccessful()) {
            System.out.println("All tests passed successfully.");
        } else {
            System.out.println("Some tests failed. See above for details.");
        }
    }
}
