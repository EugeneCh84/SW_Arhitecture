package hw_2.task_1.Classes.Rewards.Sapphire;

import hw_2.task_1.Classes.IGameItem;
import hw_2.task_1.Classes.ItemGenerator;

public class SapphireFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Sapphire();
    }
}
