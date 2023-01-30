import java.util.Optional;

public class LocationsCommandController {

  public void checkCommandLocationOne(
      String userAnswer,
      PlayerInformation playerInformation) {
    if (userAnswer.equals(LocationOneAllowedAnswer.ZABIERZBUTELKE.toString())
        || userAnswer.equals(LocationOneAllowedAnswer.ZABIERZBUTELKA.toString())
        || userAnswer.equals(LocationOneAllowedAnswer.ZABIERZBUTELKĘ.toString())) {
      try {
        commandZabierzPrzedmiot(playerInformation, "Butelka");
        System.out.println("Zabrałeś butelkę.");
      } catch (ItemNotFundException e) {
        System.out.println(e.getMessage());
      }
    } else if (userAnswer.equals(LocationOneAllowedAnswer.ZABIERZKLUCZ.toString())
        || userAnswer.equals(LocationOneAllowedAnswer.ZABIERZKLUCZE.toString())) {
      if (isItemUsed(playerInformation, "Butelka")) {
        try {
          commandZabierzPrzedmiot(playerInformation, "Klucz");
          System.out.println("Zabrałeś klucz.");
        } catch (ItemNotFundException e) {
          System.out.println(e.getMessage());
        }
      } else {
        playerInformation.setGameOver(true);
        System.out.println(
            """
                Obudziłeś strażnika. Jest rozgniewany, ponieważ chciałeś mu ukraść klucz i uciec.
                Wyprowadza Cię z celi i prowadzi na pokład.
                Przykłada Ci szable do pleców i wypycha na deskę, ustawioną w stronę morza.
                Nie masz wyjścia, skaczesz do morza, a przypływające rekiny kończą twoją przygodę.
                """);
      }
    } else if (userAnswer.equals(LocationOneAllowedAnswer.UZYJBUTELKA.toString())
        || userAnswer.equals(LocationOneAllowedAnswer.UZYJBUTELKE.toString())
        || userAnswer.equals(LocationOneAllowedAnswer.UZYJBUTELKĘ.toString())
        || userAnswer.equals(LocationOneAllowedAnswer.UŻYJBUTELKA.toString())
        || userAnswer.equals(LocationOneAllowedAnswer.UŻYJBUTELKE.toString())
        || userAnswer.equals(LocationOneAllowedAnswer.UŻYJBUTELKĘ.toString())) {
      try {
        commandUzyjPrzedmiot(playerInformation, "Butelka");
        System.out.println(
            """
                Napiłeś się z butelki. Całkiem dobry rum, ale to nie pomoże Ci uciec, może dodać Ci trochę odwagi.
                Bierzesz kolejnego łyka i uderzasz z całej siły stażnika w głowe.
                Strażnik jest ogłuszony możesz działać .""");
      } catch (ItemNotFundException e) {
        System.out.println(e.getMessage());
      }
    } else if (userAnswer.equals(LocationOneAllowedAnswer.UZYJKLUCZ.toString())
        || userAnswer.equals(LocationOneAllowedAnswer.UZYJKLUCZE.toString())
        || userAnswer.equals(LocationOneAllowedAnswer.UŻYJKLUCZ.toString())
        || userAnswer.equals(LocationOneAllowedAnswer.UŻYJKLUCZE.toString())) {
      try {
        commandUzyjPrzedmiot(playerInformation, "Klucz");
        playerInformation.getCurrentLocation().setFinished(true);
        System.out.println(
            "Super! Uciekłeś z celi. Otwierasz kolejne drzwi i wchodzisz do korytarza. Jest w nim bardzo ciemno, potykasz się o beczki.");
      } catch (ItemNotFundException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  public void checkCommandLocationTwo(
      String userAnswer,
      PlayerInformation playerInformation) {
    if (userAnswer.equals(LocationTwoAllowedAnswer.ZABIERZPOCHODNIA.toString())
        || userAnswer.equals(LocationTwoAllowedAnswer.ZABIERZPOCHODNIE.toString())
        || userAnswer.equals(LocationTwoAllowedAnswer.ZABIERZPOCHODNIĘ.toString())) {
      try {
        commandZabierzPrzedmiot(playerInformation, "Pochodnia");
        System.out.println("Zabrałeś pochodnie.");
      } catch (ItemNotFundException e) {
        System.out.println(e.getMessage());
      }
    } else if (userAnswer.equals(LocationTwoAllowedAnswer.ZABIERZKRZESIWO.toString())) {
      try {
        commandZabierzPrzedmiot(playerInformation, "Krzesiwo");
        System.out.println("Zabrałeś krzesiwo.");
      } catch (ItemNotFundException e) {
        System.out.println(e.getMessage());
      }
    } else if (userAnswer.equals(LocationTwoAllowedAnswer.UZYJPOCHODNIA.toString())
        || userAnswer.equals(LocationTwoAllowedAnswer.UZYJPOCHODNIE.toString())
        || userAnswer.equals(LocationTwoAllowedAnswer.UZYJPOCHODNIE.toString())
    ) {
      if (isItemUsed(playerInformation, "Krzesiwo")) {
        try {
          commandUzyjPrzedmiot(playerInformation, "Pochodnia");
          System.out.println(
              "Udało Ci się oświetlić pomieszczenie. Widzisz przejście prowadzące do kajuty. Idziesz tam i otwierasz drzwi.");
          playerInformation.getCurrentLocation().setFinished(true);
        } catch (ItemNotFundException e) {
          System.out.println(e.getMessage());
        }
      } else {
        System.out.println(
            "Pochodnia nie jest zapalona. Spróbuj użyć jakiś przedmiot, aby ją zapalić.");
      }
    } else if (userAnswer.equals(LocationTwoAllowedAnswer.UZYJKRZESIWO.toString())
        || userAnswer.equals(LocationTwoAllowedAnswer.UŻYJKRZESIWO.toString())) {
      try {
        commandUzyjPrzedmiot(playerInformation, "Krzesiwo");
        System.out.println(
            "Uderzasz kamieniem o kamień, po 3 minutach nierównej walki z kamyczkami udało Ci się zapalić pochodnie.");
      } catch (ItemNotFundException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  public void checkCommandLocationThree(
      String userAnswer,
      PlayerInformation playerInformation) {
    if (userAnswer.equals(LocationThreeAllowedAnswer.ZABIERZSZABLA.toString())
        || userAnswer.equals(LocationThreeAllowedAnswer.ZABIERZSZABLE.toString())) {
      try {
        commandZabierzPrzedmiot(playerInformation, "Szabla");
        System.out.println("Zabrałeś szable.");
      } catch (ItemNotFundException e) {
        System.out.println(e.getMessage());
      }
    } else if (userAnswer.equals(LocationOneAllowedAnswer.ZABIERZKLUCZ.toString())
        || userAnswer.equals(LocationOneAllowedAnswer.ZABIERZKLUCZE.toString())) {
      if (isItemUsed(playerInformation, "Szabla")) {
        try {
          commandZabierzPrzedmiot(playerInformation, "Klucz");
          System.out.println("Zabrałeś klucz.");
        } catch (ItemNotFundException e) {
          System.out.println(e.getMessage());
        }
      } else {
        playerInformation.setGameOver(true);
        System.out.println(
            """
                Kapitan sięgnął po szable i Cię ranił. Woła swoją załogę.
                Piraci Cię wyrzucją za burtę i kończą towją przygode.
                """);
      }
    } else if (userAnswer.equals(LocationThreeAllowedAnswer.UZYJSZABLA.toString())
        || userAnswer.equals(LocationThreeAllowedAnswer.UZYJSZABLE.toString())) {
      try {
        commandUzyjPrzedmiot(playerInformation, "Szabla");
        System.out.println(
            """
                Wyciagasz szable i atakujesz Kapitana.
                Kapitan blukuje cios swoim hakiem.
                Chwyta za pistolet, który miał przyboku i strzela
                Na szczęście nie trafia.
                Wyprowadzasz kolejny cios i zabijasz Kapitana.Teraz możesz zabrać klucz.
                """);
      } catch (ItemNotFundException e) {
        System.out.println(e.getMessage());
      }
    } else if (userAnswer.equals(LocationThreeAllowedAnswer.UZYJKLUCZ.toString())
        || userAnswer.equals(LocationThreeAllowedAnswer.UZYJKLUCZE.toString())
        || userAnswer.equals(LocationThreeAllowedAnswer.UŻYJKLUCZ.toString())
        || userAnswer.equals(LocationThreeAllowedAnswer.UŻYJKLUCZE.toString())) {
      try {
        commandUzyjPrzedmiot(playerInformation, "Klucz");
        System.out.println(
            """
                 Owierasz kufer, zakładasz kapelusz kapitana i bierzesz trochę złota dla załogi.
                Wychodzisz na mostek, wołasz całą załoge.
                Proponujesz im złoto za służbę pod twoimi rozkazami.
                Na szczęście poprzedni kapitan nie był lubiany, a złoto potrafi zdziałać cuda.
                Od teraz wiedziesz życie pirata.
                Ukończyłeś grę ! :)
                """);
        playerInformation.getCurrentLocation().setFinished(true);
        playerInformation.setGameOver(true);
      } catch (ItemNotFundException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  private void commandZabierzPrzedmiot(PlayerInformation playerInformation,
      String itemName)
      throws ItemNotFundException {
    Optional<Item> optionalItem =
        playerInformation
            .getCurrentLocation()
            .getLocationItems()
            .stream()
            .filter(o -> o.getName().equals(itemName))
            .findAny();
    if (optionalItem.isPresent()) {
      playerInformation.getCurrentLocation().getLocationItems().remove(optionalItem.get());
      playerInformation.getPlayerItems().add(optionalItem.get());
    } else {
      throw new ItemNotFundException("Zebrałeś już ten przedmiot.");
    }
  }

  private void commandUzyjPrzedmiot(PlayerInformation playerInformation,
      String itemName)
      throws ItemNotFundException {
    Optional<Item> optionalItem = playerInformation.getPlayerItems().stream()
        .filter(o -> o.getName().equals(itemName)).findAny();
    if (optionalItem.isPresent()) {
      playerInformation.getPlayerItems().remove(optionalItem.get());
    } else {
      throw new ItemNotFundException("Nie masz takiego przedmiotu.");
    }
  }

  private boolean isItemUsed(PlayerInformation playerInformation, String itemName) {
    Optional<Item> optionalItemInLocation =
        playerInformation
            .getCurrentLocation()
            .getLocationItems()
            .stream()
            .filter(o -> o.getName().equals(itemName))
            .findAny();
    Optional<Item> optionalItemInInventory =
        playerInformation
            .getPlayerItems()
            .stream()
            .filter(o -> o.getName().equals(itemName))
            .findAny();
    if (optionalItemInInventory.isPresent()
        || optionalItemInLocation.isPresent()) {
      return false;
    } else {
      return true;
    }
  }
}
