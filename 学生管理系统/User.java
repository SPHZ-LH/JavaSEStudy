public class User {
    private String username;
    private String password;
    private String personid;
    private String phooneNumber;

    public User() {
    }

    public User(String username, String password, String personid, String phooneNumber) {
        this.username = username;
        this.password = password;
        this.personid = personid;
        this.phooneNumber = phooneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getPhooneNumber() {
        return phooneNumber;
    }

    public void setPhooneNumber(String phooneNumber) {
        this.phooneNumber = phooneNumber;
    }

}
