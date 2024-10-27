// User-Klasse
class User {
    private String userID;
    private String email;
    private String name;
    private String vorname;

    public User(String userID, String email, String name, String vorname) {
        this.userID = userID;
        this.email = email;
        this.name = name;
        this.vorname = vorname;
    }

    // Getter-Methoden
    public String getUserID() { return userID; }
    public String getEmail() { return email; }
    public String getName() { return name; }
    public String getVorname() { return vorname; }

    @Override
    public String toString() {
        return "UserID: " + userID  + "\n" + "Email: " + email  +"\n" + "Surname: " + name +"\n"+ "Forename: " + vorname+"\n";
    }

}
