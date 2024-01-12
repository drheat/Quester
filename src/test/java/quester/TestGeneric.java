package quester;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Generic Tests")
public class TestGeneric {
    @DisplayName("Sample")
    @Test
    void sample() {
        assertEquals(1, 1);
        assertTrue(true);
		assertFalse(1 == 2);
    }
}
