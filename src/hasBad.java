public class hasBad {
  public boolean hasBad(String str) {
    if (str.length() <= 3 && !str.substring(0, str.length()).equals("bad")) {
      return false;
    }
    return(str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"));
  }
}
