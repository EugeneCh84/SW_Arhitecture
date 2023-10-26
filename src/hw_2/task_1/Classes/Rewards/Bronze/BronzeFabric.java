package hw_2.task_1.Classes.Rewards.Bronze;

import hw_2.task_1.Classes.IGameItem;
import hw_2.task_1.Classes.ItemGenerator;

public class BronzeFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}
