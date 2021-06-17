package examples;

import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;


public class RunnerTest {

    @Test
    public void runnerResponseSetTest() {

        Map<String, Object> runnerResponse =
                Runner.runFeature(
                        "classpath:examples/karate-set-test.feature",
                        Collections.emptyMap(),
                        true);
        assertNotNull(runnerResponse);
        assertFalse(runnerResponse.isEmpty());

        assertEquals(runnerResponse.get("fooDef"), "barDef");
        assertEquals(runnerResponse.get("foo_set"), "bar_set");

    }
}
