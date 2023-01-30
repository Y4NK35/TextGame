import java.util.Arrays;

public enum LocationOneAllowedAnswer {
  ZABIERZBUTELKE,
  ZABIERZBUTELKĘ,
  ZABIERZBUTELKA,
  ZABIERZKLUCZ,
  ZABIERZKLUCZE,
  UZYJBUTELKA,
  UZYJBUTELKE,
  UZYJBUTELKĘ,
  UŻYJBUTELKA,
  UŻYJBUTELKE,
  UŻYJBUTELKĘ,
  UZYJKLUCZ,
  UZYJKLUCZE,
  UŻYJKLUCZ,
  UŻYJKLUCZE;

  public static boolean isAnswerAllowed(String userAnswer) {
    return Arrays.stream(LocationOneAllowedAnswer.values())
        .anyMatch(o -> o.toString().equals(userAnswer));
  }
}
