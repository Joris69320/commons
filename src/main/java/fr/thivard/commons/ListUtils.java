package fr.thivard.commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListUtils {

    private ListUtils() {
        // utility class
    }

    /**
     * Create a mutable list from array with initial capacity equals the array length
     *
     * @param array Array to convert to list
     * @param <T>   Type of list and array
     * @return Mutable list
     */
    public static <T> List<T> mutableListFromArray(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    /**
     * Return an optional with the requested data or empty optional if IndexOutOfBoundsException is thrown
     *
     * @param list     List of the data we are looking for
     * @param position Position of the desired data in the list
     * @param <T>      List type and return data
     * @return Optional with value or en empty optional
     */
    public static <T> Optional<T> getWithIndexOutOfBoundsHandler(List<T> list, int position) {
        try {
            return Optional.ofNullable(list.get(position));
        } catch (IndexOutOfBoundsException ignored) {
            return Optional.empty();
        }
    }
}
