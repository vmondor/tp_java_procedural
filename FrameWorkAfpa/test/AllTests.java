import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import junit.framework.*;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {
	
	  public static Test suiteDeTests() {
		    TestSuite suite = new TestSuite(MathTest.class);
		    return suite;
		  }

		  public static void main(String args[]) {
		    junit.textui.TestRunner.run(suiteDeTests());
		  }
}




