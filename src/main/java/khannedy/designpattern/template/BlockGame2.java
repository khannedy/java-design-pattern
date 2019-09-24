package khannedy.designpattern.template;

public class BlockGame2 extends BlockTemplate{

  @Override
  public String getTitle() {
    return "BLOCK GAME 2";
  }

  @Override
  public String getEndTitle() {
    return "FINISH BLOCK GAME 2";
  }

  @Override
  public String getCharacter() {
    return "A";
  }

  @Override
  public Integer getHeight() {
    return 20;
  }

  @Override
  public Integer getWidth() {
    return 20;
  }

}
