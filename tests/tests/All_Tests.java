/** 
 * All_Tests.java
 * 
 * JUnit test suitw for running all JUnit tests on the Dino Quiz application.
 * 
 * Author(s):
 * 
 * John Lasheski
 * 
 */

package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Quiz_Tests.class, Quiz_Controller_Tests.class, 
                Question_Tests.class})

public class All_Tests {

}
