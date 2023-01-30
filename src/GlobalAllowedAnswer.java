import java.util.Arrays;

public enum GlobalAllowedAnswer {
  POMOC,
  PRZEDMIOTY,
  OPISZ,
  KONIECGRY;

  public static boolean isAnswerAllowed(String userAnswer) {
    return Arrays.stream(GlobalAllowedAnswer.values())
        .anyMatch(o -> o.toString().equals(userAnswer));
  }
}
