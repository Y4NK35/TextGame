import java.util.Set;

public class GlobalCommandController {

  public void checkCommand(String userAnswer, PlayerInformation playerInformation) {
    if (userAnswer.equals(GlobalAllowedAnswer.POMOC.toString())) {
      System.out.println(GameHelper.COMMAND_LIST);
    } else if (userAnswer.equals(GlobalAllowedAnswer.PRZEDMIOTY.toString())) {
      commandPrzedmioty(playerInformation.getPlayerItems());
    } else if (userAnswer.equals(GlobalAllowedAnswer.OPISZ.toString())) {
      commandOpisz(playerInformation.getCurrentLocation());
    } else if (userAnswer.equals(GlobalAllowedAnswer.KONIECGRY.toString())) {
      System.out.println("Koniec gry.");
      System.exit(0);
    }
  }

  private void commandPrzedmioty(Set<Item> items) {
    if (items.isEmpty()) {
      System.out.println("Twój ekwipunek jest pusty. Zabierz coś co widzisz w pomieszczeniu.");
    } else {
      for (Item i : items) {
        System.out.println(i.getName() + " - " + i.getDescription());
      }
    }
  }

  private void commandOpisz(Location location) {
    System.out.println(location.getDescription());
  }

}
