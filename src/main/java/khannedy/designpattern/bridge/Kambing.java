package khannedy.designpattern.bridge;

public class Kambing extends BinatangDarat{
  @Override
  public String getNama() {
    return "Kambing";
  }

  public Integer getJumlahKaki(){
    return 4;
  }

  @Override
  public Integer jumlahTelinga() {
    return 2;
  }
}
