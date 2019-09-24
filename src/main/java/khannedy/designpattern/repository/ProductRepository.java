package khannedy.designpattern.repository;

import khannedy.designpattern.objectpool.DatabasePool;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

  public void insert(Product product){
    DatabasePool.getConnection().sql("insert into products(id, name, price) values (?, ?, ?)",
      product.getId(), product.getName(), product.getPrice());
  }

  public void update(Product product){
    DatabasePool.getConnection().sql("update products set name = ?, price =? where id =?",
      product.getName(), product.getPrice(), product.getId());
  }

  public void delete(String id){
    DatabasePool.getConnection().sql("delete products where id = ?", id);
  }

  public List<Product> selectAll(){
    List<Object[]> select = DatabasePool.getConnection().select("select * from products");
    List<Product> products = new ArrayList<>();
    for(Object[] objects : select){
      Product product = new Product();
      product.setId((String) objects[0]);
      product.setName((String) objects[1]);
      product.setPrice((Integer) objects[2]);
      products.add(product);
    }
    return products;
  }

}
