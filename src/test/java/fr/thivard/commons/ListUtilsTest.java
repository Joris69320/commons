package fr.thivard.commons;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListUtilsTest {

    @Test
    void mutableListFromArray() {
        String[] array = new String[]{"1"};

        List<String> list = ListUtils.mutableListFromArray(array);
        list.add("2");

        assertEquals(2, list.size());
        assertEquals("1", list.getFirst());
        assertEquals("2", list.get(1));
    }

    @Test
    void getWithIndexOutOfBoundsHandler() {
        List<String> list = List.of("1");

        Optional<String> present = ListUtils.getWithIndexOutOfBoundsHandler(list, 0);
        Optional<String> empty = ListUtils.getWithIndexOutOfBoundsHandler(list, 1);

        assertTrue(present.isPresent());
        assertTrue(empty.isEmpty());
    }
}