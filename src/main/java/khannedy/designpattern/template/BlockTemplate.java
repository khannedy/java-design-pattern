package khannedy.designpattern.template;

public abstract class BlockTemplate {

  public final void start(){
    System.out.println(getTitle());

    for (int i = 0; i < getHeight(); i++) {
      for (int j = 0; j < getWidth(); j++) {
        System.out.print(getCharacter());
      }
      System.out.print("\n\r");
    }

    System.out.println(getEndTitle());
  }

  public abstract String getTitle();

  public abstract String getEndTitle();

  public abstract String getCharacter();

  public abstract Integer getHeight();

  public abstract Integer getWidth();

}
