package khannedy.designpattern.template;

public class BlockGame3 extends BlockTemplate{

  @Override
  public String getTitle() {
    return "BLOCK GAME 3";
  }

  @Override
  public String getEndTitle() {
    return "END BLOCK GAME 3";
  }

  @Override
  public String getCharacter() {
    return "X";
  }

  @Override
  public Integer getHeight() {
    return 10;
  }

  @Override
  public Integer getWidth() {
    return 20;
  }

}
