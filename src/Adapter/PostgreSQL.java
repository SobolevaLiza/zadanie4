package Adapter;

public class PostgreSQL implements TargetDB {
  @Override
  public void connect() {
    System.out.println("Подключение к PostgreSQL");
  }

  @Override
  public void insertData() {
    System.out.println("Добавление данных");
  }

  @Override
  public void disconnect() {
    System.out.println("Выход из Postgre");
  }
}
