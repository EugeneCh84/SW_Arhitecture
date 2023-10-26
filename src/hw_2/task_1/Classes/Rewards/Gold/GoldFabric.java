package hw_2.task_1.Classes.Rewards.Gold;

import hw_2.task_1.Classes.ItemGenerator;
import hw_2.task_1.Classes.IGameItem;

public class GoldFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
