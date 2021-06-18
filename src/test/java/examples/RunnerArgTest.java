package examples;

import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;


public class RunnerArgTest {

    @Test
    /**
     * This test fails on karate versions: 1.1.0.RC1, 1.1.0.RC2, 1.1.0.RC3
     */
    public void runnerOverrideArgTest() {

        Map<String, Object> runnerResponse =
                Runner.runFeature(
                        "classpath:examples/runner-arg.feature",
                        Collections.singletonMap("foo", "after"),
                        true);
        assertNotNull(runnerResponse);
        assertFalse(runnerResponse.isEmpty());

        assertEquals("after", runnerResponse.get("foo"));
    }


    @Test
    /**
     * passes
     */
    public void runnerNoArgTest() {

        Map<String, Object> runnerResponse =
                Runner.runFeature(
                        "classpath:examples/runner-arg.feature",
                        Collections.emptyMap(),
                        true);
        assertNotNull(runnerResponse);
        assertFalse(runnerResponse.isEmpty());
        assertEquals("before", runnerResponse.get("foo"));
    }



    @Test
    /**
     * passes
     */

    public void runnerNewArgTest() {

        Map<String, Object> runnerResponse =
                Runner.runFeature(
                        "classpath:examples/runner-arg.feature",
                        Collections.singletonMap("bar", "new"),
                        true);
        assertNotNull(runnerResponse);
        assertFalse(runnerResponse.isEmpty());

        assertEquals("new", runnerResponse.get("bar"));
    }
}
