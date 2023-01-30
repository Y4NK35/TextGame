public class Item {

  private String name;
  private String description;
  private String descriptionToLocation;

  public Item(String name, String description, String descriptionToLocation) {
    this.name = name;
    this.description = description;
    this.descriptionToLocation = descriptionToLocation;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescriptionToLocation() {
    return descriptionToLocation;
  }

  public void setDescriptionToLocation(String descriptionToLocation) {
    this.descriptionToLocation = descriptionToLocation;
  }
}
