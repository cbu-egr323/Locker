import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Alicia Locker - TestSuite.java - EGR326 - CBU - 3/28/2019
 */
//ran with code coverage and managed to receive 100% code coverage for Triangle test
    // UseTriangle was tested as well but most functionality went into triangle.  Also unsure how to test with println statements and user input
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TriangleTst.class,
        UseTriangleTst.class
})
public class TestSuite {

}
