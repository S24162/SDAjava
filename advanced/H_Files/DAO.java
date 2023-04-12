package pl.sdacademy.java.advanced.H_Files;

import java.util.List;
import java.util.Optional;

//  CRUD
public interface DAO<T> {
    Boolean create(T newObj);
    Optional<T> read(Integer id);
    List<T> read();
    Boolean delete(Integer id);
    Boolean delete(T objToDelete);
}
