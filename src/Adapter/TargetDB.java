package Adapter;

public interface TargetDB {
  void connect();
  void insertData();
  void disconnect();
}
