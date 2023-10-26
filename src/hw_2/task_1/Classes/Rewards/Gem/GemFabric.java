package hw_2.task_1.Classes.Rewards.Gem;

import hw_2.task_1.Classes.ItemGenerator;
import hw_2.task_1.Classes.IGameItem;

public class GemFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
