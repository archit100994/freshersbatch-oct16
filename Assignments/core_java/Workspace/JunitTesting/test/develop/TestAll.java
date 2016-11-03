package develop;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({StringOperationsTestCombined.class, StringOperationsTest1.class, StringOperationsTest2.class, StringOperationsTest3.class})
public class TestAll {

}
