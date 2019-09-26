package khannedy.designpattern.bridge;

public class Kucing extends BinatangDarat {
  @Override
  public String getNama() {
    return "Kucing";
  }

  public Integer getJumlahKaki(){
    return 4;
  }

  @Override
  public Integer jumlahTelinga() {
    return 2;
  }
}
