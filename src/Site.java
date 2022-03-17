// --== CS400 File Header Information ==--
// Name: Taylor Mehmen
// Email: tmehmen@wisc.edu
// Team: LD
// Role: BackEnd
// TA: Divyanshu
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>


public class Site {
    private String name;
    private String username;
    private String password;

    public Site(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
