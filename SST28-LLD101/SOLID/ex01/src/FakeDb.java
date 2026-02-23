import java.util.ArrayList;
import java.util.List;

public class FakeDb implements StudentRepository {

    private final List<StudentRecord> store = new ArrayList<>();

    @Override
    public void save(StudentRecord student) {
        store.add(student);
    }

    @Override
    public int count() {
        return store.size();
    }

    @Override
    public List<StudentRecord> findAll() {
        return new ArrayList<>(store);
    }
}