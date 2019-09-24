package khannedy.designpattern.facade.entity;

public class Address {

  private String id;

  private String street;

  private String country;

  public Address(String id, String street, String country) {
    this.id = id;
    this.street = street;
    this.country = country;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
