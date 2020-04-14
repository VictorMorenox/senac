public class Logger {
  
  private int id;
  private String type;
  private String status;
  private String description;
  
  public Logger(int id, String type, String status, String description) {
    this.id = id;
    this.type = type;
    this.status = status;
    this.description = description;
  }
  
  public int getId() {
    return id;
  }
  
  public String getType() {
    return type;
  }
  
  public String getStatus() {
    return status;
  }
  
  public String getDescription() {
    return description;
  }
}
