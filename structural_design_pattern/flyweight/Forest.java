package structural_design_pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    List<Tree> trees;

    public Forest() {
        this.trees = new ArrayList<>();
    }

    Tree plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
        return tree;
    }

    void draw(Canvas canvas) {
        for (Tree tree : trees) {
            tree.draw(canvas);
        }
    }
}
