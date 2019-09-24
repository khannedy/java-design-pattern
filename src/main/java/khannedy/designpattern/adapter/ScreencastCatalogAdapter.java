package khannedy.designpattern.adapter;

public class ScreencastCatalogAdapter implements CatalogAdapter {

  private Screencast screencast;

  public ScreencastCatalogAdapter(Screencast screencast) {
    this.screencast = screencast;
  }

  @Override
  public String getCatalogTitle() {
    return screencast.getTitle() + " by " + screencast.getAuthor();
  }
}
