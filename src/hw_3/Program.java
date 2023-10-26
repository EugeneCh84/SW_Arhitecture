package hw_3;

import java.awt.Color;
import hw_3.Classes.CarWash;

public class Program {

  /**
   * 1. Спроектировать абстрактный класс «Car» у которого должны быть свойства: марка, модель, цвет,
   * тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя; методы: движение,
   * обслуживание, переключение передач, включение фар, включение дворников.
   * <p>
   * 2. Создать конкретный автомобиль путём наследования класса «Car». 3. Расширить абстрактный
   * класс «Car», добавить метод: подметать улицу. Создать конкретный автомобиль путём наследования
   * класса «Car». Провести проверку принципа SRP.
   * <p>
   * 4. Расширить абстрактный класс «Car», добавить метод: включение противотуманных фар, перевозка
   * груза. Провести проверку принципа OCP.
   * <p>
   * 5. Создать конкретный автомобиль путём наследования класса «Car», определить число колёс = 3.
   * Провести проверку принципа LSP.
   * <p>
   * 6. Создать конкретный автомобиль путём наследования класса «Car», определить метод «движение» -
   * «полёт». Провести проверку принципа LSP.
   * <p>
   * 7. Создать интерфейс «Заправочная станция», создать метод: заправка топливом.
   * <p>
   * <p>
   * 8. Имплементировать метод интерфейса «Заправочная станция» в конкретный класс «Car».
   * <p>
   * 9. Добавить в интерфейс «Заправочная станция» методы: протирка лобового стекла, протирка фар,
   * протирка зеркал.
   * <p>
   * 10. Имплементировать все методы интерфейса «Заправочная станция» в конкретный класс «Car».
   * Провести проверку принципа ISP. Создать дополнительный/е интерфейсы и имплементировать их в
   * конкретный класс «Car». Провести проверку принципа ISP.
   * <p>
   * 11. Создать путём наследования класса «Car» два автомобиля: с бензиновым и дизельным
   * двигателями, имплементировать метод «Заправка топливом» интерфейса «Заправочная станция».
   * Реализовать заправку каждого автомобиля подходящим топливом. Провести проверку принципа DIP.
   *
   * @param args
   */
  public static void main(String[] args) {

      CarWash carWash = new CarWash();

      // Создаем автомобили разных типов
      Harvester harvester = new Harvester("John Deere", "S790", Color.GREEN);
      harvester.setFuelType(FuelType.Diesel);

      SportCar sportCar = new SportCar("Ferrari", "488 GTB", Color.RED);
      sportCar.setFuelType(FuelType.Gasoline);

      // Заправляем и моем автомобили
      RefuelingStation refuelingStation = new RefuelingStation();
      refuelingStation.fuel(harvester.getFuelType());
      carWash.wash(harvester);

      RefuelingStationV2 refuelingStationV2 = new RefuelingStationV2();
      refuelingStationV2.fuel(sportCar.getFuelType());
      carWash.wash(sportCar);
  }

}
