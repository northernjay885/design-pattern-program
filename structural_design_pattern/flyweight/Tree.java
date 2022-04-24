package structural_design_pattern.flyweight;

public class Tree {
    int x;
    int y;
    TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = TreeFactory.getTreeType(treeType.name, treeType.color, treeType.texture);
    }


    void draw(Canvas canvas) {

    }
}
