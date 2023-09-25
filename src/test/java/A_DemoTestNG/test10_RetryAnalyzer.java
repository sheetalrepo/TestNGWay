package A_DemoTestNG;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class test10_RetryAnalyzer implements IRetryAnalyzer{
    int counter = 0;
    int retryLimit = 4;  

    //This method will return true if a tests needs to be retried again
    @Override
    public boolean retry(ITestResult result) {

        if(counter < retryLimit)
        {
            counter++;
            return true;
        }
        return false;
    }
}
