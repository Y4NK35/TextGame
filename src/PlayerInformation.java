import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class PlayerInformation {

  private Location currentLocation;
  private ItemComparator itemComparator = new ItemComparator();
  private Set<Item> playerItems = new TreeSet<>(itemComparator);
  private boolean isGameOver;


  public Location getCurrentLocation() {
    return currentLocation;
  }

  public void setCurrentLocation(Location currentLocation) {
    this.currentLocation = currentLocation;
  }

  public void addItem(Item item) {
    playerItems.add(item);
  }

  public void removeItem(Item item) {
    playerItems.remove(item);
  }

  public Set<Item> getPlayerItems() {
    return playerItems;
  }

  public void setGameOver(boolean gameOver) {
    isGameOver = gameOver;
  }

  public boolean isGameOver() {
    return isGameOver;
  }
}

