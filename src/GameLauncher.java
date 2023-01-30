public class GameLauncher {

  private final GameHelper gameHelper = new GameHelper();
  private final Startup startup = new Startup();
  private final PlayerInformation playerInformation = new PlayerInformation();
  private final GlobalCommandController globalCommandController = new GlobalCommandController();
  private final LocationsCommandController locationsCommandController = new LocationsCommandController();

  public void start() {
    setUpGame();

    while (!playerInformation.isGameOver()) {
      locationOneControl();
      playerInformation.setCurrentLocation(startup.createLocationTwo());
      locationTwoControl();
      playerInformation.setCurrentLocation(startup.createLocationThree());
      locationThreeControl();
      gameHelper.getUserInput("Chcesz zagrać jeszcze raz?");
      while (!gameHelper.IsInputEndGameCorrect()) {
        gameHelper.getUserInput(
            "Wpisz tak, jeśli chcesz zagrać jeszcze raz, nie jak chcesz skończyć grę.");
      }
      if (gameHelper.checkEndAnswer()) {
        setUpGame();
      }
    }
  }

  public void setUpGame() {
    Location location1 = startup.createLocationOne();
    playerInformation.setCurrentLocation(location1);
    playerInformation.getPlayerItems().forEach(o -> playerInformation.removeItem(o));
    playerInformation.setGameOver(false);
    gameHelper.showMessage(GameHelper.WELCOME_MESSAGE);
    gameHelper.showMessage(GameHelper.COMMAND_LIST);
    gameHelper.showMessage(GameHelper.INTRODUCTION_MESSAGE);
  }

  public void locationOneControl() {
    while (!playerInformation.getCurrentLocation().isFinished()
        && !playerInformation.isGameOver()) {
      gameHelper.getUserInput("\nCo chcesz zrobić? Wpisz komende:  ");
      if (GlobalAllowedAnswer.isAnswerAllowed(gameHelper.getUserAnswer())) {
        globalCommandController.checkCommand(gameHelper.getUserAnswer(), getPlayerInformation());
      } else if (LocationOneAllowedAnswer.isAnswerAllowed(gameHelper.getUserAnswer())) {
        locationsCommandController.checkCommandLocationOne(gameHelper.getUserAnswer(),
            playerInformation);
      } else {
        System.out.println("Spróbuj jeszcze raz, nie ma takiej komendy.");
      }
    }
  }

  public void locationTwoControl() {
    while (!playerInformation.getCurrentLocation().isFinished()
        && !playerInformation.isGameOver()) {
      gameHelper.getUserInput("\nCo chcesz zrobić? Wpisz komende:  ");
      if (GlobalAllowedAnswer.isAnswerAllowed(gameHelper.getUserAnswer())) {
        globalCommandController.checkCommand(gameHelper.getUserAnswer(), getPlayerInformation());
      } else if (LocationTwoAllowedAnswer.isAnswerAllowed(gameHelper.getUserAnswer())) {
        locationsCommandController.checkCommandLocationTwo(gameHelper.getUserAnswer(),
            playerInformation);
      } else {
        System.out.println("Spróbuj jeszcze raz, nie ma takiej komendy.");
      }
    }
  }

  public void locationThreeControl() {
    while (!playerInformation.getCurrentLocation().isFinished()
        && !playerInformation.isGameOver()) {
      gameHelper.getUserInput("\nCo chcesz zrobić? Wpisz komende:  ");
      if (GlobalAllowedAnswer.isAnswerAllowed(gameHelper.getUserAnswer())) {
        globalCommandController.checkCommand(gameHelper.getUserAnswer(), getPlayerInformation());
      } else if (LocationThreeAllowedAnswer.isAnswerAllowed(gameHelper.getUserAnswer())) {
        locationsCommandController.checkCommandLocationThree(gameHelper.getUserAnswer(),
            playerInformation);
      } else {
        System.out.println("Spróbuj jeszcze raz, nie ma takiej komendy.");
      }
    }
  }

  public PlayerInformation getPlayerInformation() {
    return playerInformation;
  }
}
