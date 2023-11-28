package Adapter;

public class MySQL implements Source {
  @Override
  public void connect() {
    System.out.println("Подключение к MySQL");
  }

  @Override
  public void fetchData() {
    System.out.println("Получение данных");
  }

  @Override
  public void disconnect() {
    System.out.println("Выход из MySQL");
  }
}
