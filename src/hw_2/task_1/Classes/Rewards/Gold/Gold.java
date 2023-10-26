package hw_2.task_1.Classes.Rewards.Gold;

import hw_2.task_1.Classes.IGameItem;

public class Gold implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gold!");
    }
}
