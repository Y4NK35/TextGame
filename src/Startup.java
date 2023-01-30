public class Startup {


  public Location createLocationOne() {
    Item bottle = new Item(
        "Butelka",
        "Butelka z resztką rumu.",
        "Na podłodze obok drzemiącego strażnika leży butelka z resztką rumu.");
    Item key = new Item(
        "Klucz",
        "Zardzewiały klucz, na pewno można nim coś otworzyć.",
        "Przy pasie strażnika zwisa stary, rdzewiejący klucz.");
    Location location1 = new Location(
        "Cela",
        "Znajdujesz się na pirackim statku. Jesteś sam w celi, z której musisz się wydostać jeśli chcesz przeżyć.");
    location1.addItem(bottle);
    location1.addItem(key);
    return location1;
  }

  public Location createLocationTwo() {
    Item bottle = new Item(
        "Pochodnia",
        "Pochodnia, użuj ją by oświetlić drogę.",
        "Na ścianie wisi pochodnia, niestety jest zgaszona.");
    Item key = new Item(
        "Krzesiwo",
        "Krzesiwo służy do rozpalania ognia.",
        "Na skrzyni leżą dwa kamienie. To na pewno jest krzesiwo.");
    Location location2 = new Location(
        "Korytarz",
        "Znajdujesz się na pirackim statku. Uciekłeś z celi, teraz jesteś w bardzo ciemnym korytarzu. W mroku możesz dojrzeć tylko kilka rzeczy.");
    location2.addItem(bottle);
    location2.addItem(key);
    return location2;
  }

  public Location createLocationThree() {
    Item sword = new Item(
        "Szabla",
        "Szabla piratów. Służy do walki.",
        "Na kufrze po twojej prawej stronie leży szabla");
    Item key = new Item(
        "Klucz",
        "Klucz do skrzyni kapitana.",
        "Na stole przed kapitanem leży, złoty klucz. Na pewno otwiera skarb.");
    Location location3 = new Location(
        "Kajuta kapitana",
        "Znajdujesz się na pirackim statku. Uciekłeś z celi, przeszedłeś korytarz. Wchodzisz do kajuty kapitana."
            + " Za stołem stoi groźny kapitan, z przepaską na lewym oku.");
    location3.addItem(sword);
    location3.addItem(key);
    return location3;
  }
}
