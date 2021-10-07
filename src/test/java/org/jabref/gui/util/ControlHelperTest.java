package org.jabref.gui.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ControlHelperTest {
    @Test
    public void testTruncateString() {
        assertNull(ControlHelper.truncateString(null, 0, null, null));
        assertEquals("", ControlHelper.truncateString("", 0, null, null));
        assertEquals("JabRef is a reference management tool", ControlHelper.truncateString("JabRef is a reference management tool", -1, null, null));
        assertEquals("... tool", ControlHelper.truncateString("JabRef is a reference management tool", 8, "...", ControlHelper.EllipsisPosition.BEGINNING));
        assertEquals("Jab...ool", ControlHelper.truncateString("JabRef is a reference management tool", 10, "...", ControlHelper.EllipsisPosition.CENTER));
        assertEquals("...", ControlHelper.truncateString("JabRef is a reference management tool", 2, "...", ControlHelper.EllipsisPosition.ENDING));
    }
}
