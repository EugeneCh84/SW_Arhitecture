package hw_2.task_1.Classes.Rewards.Gem;

import hw_2.task_1.Classes.IGameItem;

public class Gem  implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gem!");
    }
}
