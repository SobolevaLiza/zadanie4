import Adapter.*;

public class Main {
  public static void main(String[] args) {
    Source mysqlDatabase = new MySQL();
    TargetDB postgresDatabase = new PostgreSQL();

    TargetDB adapter = new DataBase(mysqlDatabase);

    adapter.connect();
    adapter.insertData();
    adapter.disconnect();
  }
}