import java.util.ArrayList;
import java.util.List;

public class Logger {

  private final static List<String> logs = new ArrayList<>();

  public static void info(Class clazz, String logLine) {
    logs.add("Class: " + clazz.getName() + ": " + logLine);
  }

  public static void printLog() {
    for (String log : logs) {
      System.out.println(log);
    }
  }
}
