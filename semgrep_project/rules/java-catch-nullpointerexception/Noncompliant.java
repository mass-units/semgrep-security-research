class Main {
    boolean isWinterMonth(String s) {
  try {
    return s.equals("December") || s.equals("January") || s.equals("February") || s.equals("March");
  } catch (NullPointerException e) {
    return false;
  }
}
}