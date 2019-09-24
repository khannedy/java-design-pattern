package khannedy.designpattern.singleton;

import khannedy.designpattern.objectpool.DatabasePool;

public class OrderDetailService {

  public void save(String orderId, String product){
    Connection connection = DatabasePool.getConnection();
    connection.sql("INSER INTO ORDER_DETAILS ...");
    DatabasePool.close(connection);
  }

}
