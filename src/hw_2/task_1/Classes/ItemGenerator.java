package hw_2.task_1.Classes;

public abstract class ItemGenerator {
    public void openReward()
    {
        IGameItem gameItem = createItem();
        gameItem.open();

    }
    public abstract IGameItem createItem();
}
