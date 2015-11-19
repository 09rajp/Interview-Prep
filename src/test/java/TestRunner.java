package test.java;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by derek on 11/18/15.
 */
public class TestRunner {
    public static void main(String args[]) {
        Result result = JUnitCore.runClasses(ListTests.class);
        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}