package Adapter;

public class DataBase implements TargetDB {
  private final Source source;

  public DataBase(Source source) {
    this.source = source;
  }

  @Override
  public void connect() {
    source.connect();
  }

  @Override
  public void insertData() {
    source.fetchData();
  }

  @Override
  public void disconnect() {
    source.disconnect();
  }
}
