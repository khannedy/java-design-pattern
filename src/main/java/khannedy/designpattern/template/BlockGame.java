package khannedy.designpattern.template;

public class BlockGame extends BlockTemplate{

  @Override
  public String getTitle() {
    return "BLOCK GAME";
  }

  @Override
  public String getEndTitle() {
    return "FINISH BLOCK GAME";
  }

  @Override
  public String getCharacter() {
    return "O";
  }

  @Override
  public Integer getHeight() {
    return 10;
  }

  @Override
  public Integer getWidth() {
    return 10;
  }
}
