package khannedy.designpattern.bridge;

public class Anjing extends BinatangDarat {
  @Override
  public String getNama() {
    return "Anjing";
  }

  public Integer getJumlahKaki(){
    return 4;
  }

  @Override
  public Integer jumlahTelinga() {
    return 2;
  }
}
