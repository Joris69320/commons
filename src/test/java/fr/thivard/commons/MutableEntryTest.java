package fr.thivard.commons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MutableEntryTest {

    private final MutableEntry<String, String> mutableEntry = new MutableEntry<>("key", "value");

    @Test
    void getKey() {
        assertEquals("key", mutableEntry.getKey());
    }

    @Test
    void getValue() {
        assertEquals("value", mutableEntry.getValue());
    }

    @Test
    void setValue() {
        mutableEntry.setValue("value2");
        assertEquals("value2", mutableEntry.getValue());
    }
}