package khannedy.designpattern.adapter;

public class BookCatalogAdapter implements CatalogAdapter {

  private Book book;

  public BookCatalogAdapter(Book book) {
    this.book = book;
  }

  @Override
  public String getCatalogTitle() {
    return book.getTitle() + " by " + book.getAuthor();
  }
}
