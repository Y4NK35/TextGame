import java.util.Arrays;

public enum LocationThreeAllowedAnswer {
  ZABIERZKLUCZ,
  ZABIERZKLUCZE,
  ZABIERZSZABLE,
  ZABIERZSZABLA,
  UZYJKLUCZ,
  UZYJKLUCZE,
  UŻYJKLUCZ,
  UŻYJKLUCZE,
  UZYJSZABLE,
  UZYJSZABLA,
  UŻYJSZABLE,
  UŻYJSZABLA;

  public static boolean isAnswerAllowed(String userAnswer) {
    return Arrays.stream(LocationThreeAllowedAnswer.values())
        .anyMatch(o -> o.toString().equals(userAnswer));
  }
}
