package pl.sdacademy.java.zaawansowana.da6.TXT;

import pl.sdacademy.java.zaawansowana.da6.DAO;

import java.util.List;
import java.util.Optional;

public class ToDoListDAO {
    public class ToDpListDAO implements DAO<String> {
        private final String filePath;

        public ToDpListDAO(String filePath) {
            this.filePath = filePath;
        }

        @Override
        public Boolean create(String newObj) {
            return null;
        }

        @Override
        public Optional<String> read(Integer id) {
            return Optional.empty();
        }

        @Override
        public List<String> read() {
            return null;
        }

        @Override
        public Boolean delete(String objToDelete) {
            return null;
        }

        private Optional<Object> readWholeFile() {
//            try {
//                String contents = Files.readString(Paths.get(this.filePath));
//
//                if (contents.isBlank()) {
////                    return Optional.empty();
//                }
//                else {
////                    return Optional.of(contents);
//                }
//            } catch (IOException e) {
////                return new ArrayList<>();
//            }
            return Optional.empty();
        }
    }
}
