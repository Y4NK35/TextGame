import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class Location {

  private String name;
  private String description;
  private ItemComparator itemComparator = new ItemComparator();
  private Set<Item> locationItems = new TreeSet<Item>(itemComparator);
  private boolean isFinished = false;

  public Location(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public void addItem(Item item) {
    locationItems.add(item);
  }

  public void removeItemByName(String name) {
    Optional<Item> optionalItem = locationItems.stream().filter(i -> i.getName().equals(name))
        .findAny();
    if (optionalItem.isPresent()) {
      locationItems.remove(optionalItem.get());
    }
  }

  public Set<Item> getLocationItems() {
    return locationItems;
  }

  public void setLocationItems(Set<Item> locationItems) {
    this.locationItems = locationItems;
  }

  public String getDescription() {
    StringBuilder sb = new StringBuilder();
    sb.append(description);
    if (!locationItems.isEmpty()) {
      sb.append(" Oto co widzisz: \n");
      for (Item i : locationItems) {
        sb.append(i.getDescriptionToLocation() + "\n");
      }
    }
    return sb.toString();
  }

  public boolean isFinished() {
    return isFinished;
  }

  public void setFinished(boolean finished) {
    isFinished = finished;
  }
}
