package structural_design_pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> map = new HashMap<>();

    private TreeFactory() {
    }

    public static TreeType getTreeType(String name, String color, String texture) {
        if (!map.containsKey(name)) {
            map.put(name, new TreeType(name, color, texture));
        }
        return map.get(name);
    }
}
