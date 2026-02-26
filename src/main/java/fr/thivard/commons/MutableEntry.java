package fr.thivard.commons;

import java.util.Map;
import java.util.Objects;

public class MutableEntry<K, V> implements Map.Entry<K, V> {

    private final K key;
    private V value;

    public MutableEntry(K key, V value) {
        Objects.requireNonNull(key, "Key must be not null!");
        this.key = key;
        this.setValue(value);
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        Objects.requireNonNull(key, "Value must be not null!");
        this.value = value;
        return value;
    }
}
