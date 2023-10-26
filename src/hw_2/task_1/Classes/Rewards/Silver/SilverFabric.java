package hw_2.task_1.Classes.Rewards.Silver;

import hw_2.task_1.Classes.IGameItem;
import hw_2.task_1.Classes.ItemGenerator;

public class SilverFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
