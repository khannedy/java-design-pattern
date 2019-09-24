package khannedy.designpattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterApp {

  public static void main(String[] args) {
    List<CatalogAdapter> list = new ArrayList<>();

    list.add(new BookCatalogAdapter(new Book("Pemrograman Java", "Eko")));
    list.add(new BookCatalogAdapter(new Book("Pemrograman PHP", "Kurniawan")));
    list.add(new BookCatalogAdapter(new Book("Pemrograman Python", "Khannedy")));

    list.add(new ScreencastCatalogAdapter(new Screencast("Web Laravel", "Joko", 100L)));
    list.add(new ScreencastCatalogAdapter(new Screencast("Web Rails", "Rudi", 200L)));
    list.add(new ScreencastCatalogAdapter(new Screencast("Flask Web", "Ardi", 150L)));

    list.forEach(item -> {
      System.out.println(item.getCatalogTitle());
    });
  }
}
