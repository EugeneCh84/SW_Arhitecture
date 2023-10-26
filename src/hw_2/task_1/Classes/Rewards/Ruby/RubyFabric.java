package hw_2.task_1.Classes.Rewards.Ruby;

import hw_2.task_1.Classes.IGameItem;
import hw_2.task_1.Classes.ItemGenerator;

public class RubyFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Ruby();
    }
}
