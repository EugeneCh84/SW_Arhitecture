package hw_2.task_1.Classes.Rewards.Platinum;

import hw_2.task_1.Classes.IGameItem;

public class Platinum implements IGameItem {
    @Override
    public void open() {
        System.out.println("Platinum!");
    }
}