package behavior_design_pattern.chain_of_responsiblity;

import java.util.List;

public abstract class Container extends Component {
    List<Component> children;

    public void add(Component child) {
        children.add(child);
        child.container = this;
    }

//    @Override
//    public void showHelp() {
//        super.showHelp();
//    }
}
