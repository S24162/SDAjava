package pl.sdacademy.java.advanced.day6;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    Boolean create (T newObj);
    Optional<T> read(Integer id);
    List<T> read();
    Boolean delete(T objToDelete);
}
