import java.util.*;

public class MenuRepository {

    private final Map<String, MenuItem> menu = new HashMap<>();

    public MenuRepository() {
        menu.put("V1", new MenuItem("V1", "Veg Thali", 80));
        menu.put("C1", new MenuItem("C1", "Coffee", 30));
    }

    public MenuItem findByCode(String code) {
        return menu.get(code);
    }
}