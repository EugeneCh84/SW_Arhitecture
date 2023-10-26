package hw_2.task_1.Classes.Rewards.Platinum;

import hw_2.task_1.Classes.IGameItem;
import hw_2.task_1.Classes.ItemGenerator;

public class PlatinumFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Platinum();
    }
}
