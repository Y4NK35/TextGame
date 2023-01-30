import java.util.Scanner;

public class GameHelper {

  private String userAnswer;

  static final String WELCOME_MESSAGE =
      """
          Cześć, zagraj w moją gre. Oto kilka słów wprowadzenia.\s
          1. Ruchy, które chcesz wykonać wpisz w konsole.\s
          Na przykład z opisu dowiadujesz się, że w pomieszczeniu jest butelka, możesz spróbować komendy zabierz butelkę.
          2. Kiedy skończą Ci się pomysły możesz użyć komendy "pomoc", która wyświetli dostępne komendy
          3. Użycie komendy "koniec gry", kończy grę w dowolnym momencie.
          4. Użycie komendy "przedmioty", wyświetla listę przedmiotów.
          5. Użycie komendy "opisz", opisuję twoją aktualną lokalizacje.
          6. Użycie komendy "zabierz/użyj +"nazwa przedmiotu"", zbierasz użwasz dany przedmiot.
          """;
  static final String COMMAND_LIST =
      """
          Lista dostępnych komend:\s
          - pomoc- wyświetla dostępne komendy
          - przedmioty- wyświetla listę przedmiotów
          - opisz- opisuje aktualną lokacje
          - zabierz/użyj + "nazwa przedmiotu"- zbierasz/ używasz przedmiot
          - koniec gry - kończysz grę w dowolnym momencie
          """;
  static final String INTRODUCTION_MESSAGE =
      """
          WPROWADZENIE
                  
          Budzi Cię unoszący się w powietrzu zapach prochu i rumu.
          Leżysz na twardej podłodze, bolą Cię wszystkie mięśnie
          Po kilku minutach dochodzenia do siebie leniwie otwierasz jedno oko.
          Ostanie co pamiętasz to podpływający statek z czarnym masztem, świst przelatującej kuli armatniej i huk złamanego masztu
          Przypominasz sobie, zaciągnąłeś się na statek Santa Margarita pływający pod banderą Hiszpani.
          Dochodzisz do wniosku, że piraci wzięli Cie w niewolę. Prawdopodobnie chcą Cie sprzedać na czarnym rynku, dlatego jeszcze żyjesz.
          Musisz działać szybko, żeby się uwolnić, ale bądź ostrożny piraci są groźni.""";

  public void showMessage(String s) {
    System.out.println(s);
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
    }
  }

  public void getUserInput(String prompt) {
    String Answer;
    System.out.println(prompt);
    Scanner scanner = new Scanner(System.in);
    Answer = scanner.nextLine().toUpperCase().replace(" ", "");
    setUserAnswer(Answer);
  }

  public String getUserAnswer() {
    return userAnswer;
  }

  public void setUserAnswer(String userAnswer) {
    this.userAnswer = userAnswer;
  }

  public boolean IsInputEndGameCorrect() {
    if (userAnswer.equals("TAK")
        || userAnswer.equals("NIE")) {
      return true;
    } else {
      return false;
    }
  }

  public boolean checkEndAnswer() {
    if (userAnswer.equals("NIE")) {
      endMessage();
      return false;
    } else {
      return true;
    }
  }

  public void endMessage() {
    System.out.println("Dzięki za gre. Miłego dnia !");
  }
}
