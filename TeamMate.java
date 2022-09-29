public class TeamMate {
    private String userId;
    private String name;
    private Boolean online;
  
    public TeamMate() {
        this.userId = "999999";
        this.name = "undefinied";
        this.online = false;
    }
  
    public TeamMate(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.online = false;
    }
  
    public TeamMate(String userId, String name, boolean online) {
        this.userId = userId;
        this.name = name;
        this.online = online;
    }
  
    public String getUserId() {
        return this.userId;
    }
  
    public void setUserId(String userId) {
        this.userId = userId;
    }
  
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public boolean getOnline() {
        return this.online;
    }
    
    public void setOnline(Boolean online) {
        this.online = online;
    }
  }