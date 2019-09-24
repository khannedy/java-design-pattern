package khannedy.designpattern.template;

public class TemplateApp {

  public static void main(String[] args) {
    BlockGame blockGame = new BlockGame();
    blockGame.start();

    BlockGame2 blockGame2 = new BlockGame2();
    blockGame2.start();

    BlockGame3 blockGame3 = new BlockGame3();
    blockGame3.start();
  }
}
