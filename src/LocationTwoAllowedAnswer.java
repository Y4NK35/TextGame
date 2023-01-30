import java.util.Arrays;

public enum LocationTwoAllowedAnswer {
  ZABIERZPOCHODNIE,
  ZABIERZPOCHODNIĘ,
  ZABIERZPOCHODNIA,
  ZABIERZKRZESIWO,
  UZYJKRZESIWO,
  UŻYJKRZESIWO,
  UZYJPOCHODNIE,
  UZYJPOCHODNIĘ,
  UZYJPOCHODNIA;

  public static boolean isAnswerAllowed(String userAnswer) {
    return Arrays.stream(LocationTwoAllowedAnswer.values())
        .anyMatch(o -> o.toString().equals(userAnswer));
  }
}
