// --== CS400 File Header Information ==--
// Name: Taylor Mehmen
// Email: tmehmen@wisc.edu
// Team: LD
// Role: BackEnd
// TA: Divyanshu
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>


import java.util.ArrayList;
import java.util.NoSuchElementException;
import netscape.javascript.JSObject;


public class DataProcessor {
    private HashTableMap<String, User> userMap;

    public DataProcessor() {
        userMap = new HashTableMap<String, User>();
    }

    public void createUser(String username, String password){
        User user = new User(username, password);
        userMap.put(username,user);
        System.out.println(userMap.get(username).getUsername());
    }

    public boolean enterUsername(String username){
        System.out.println(username);
        try {
            userMap.get(username);
            return true;
        }
        catch (NoSuchElementException e){
            return false;
        }

    }

    public boolean enterPassword(String username, String password){
        try {
            User user = userMap.get(username);
            return user.getPassword().equals(password);
        }
        catch (NoSuchElementException e){
            System.out.println("The username is not in the hashtable," +
                    "this should be tested with enterUsername()");
            return false;
        }
    }

    public void addUserSite(String siteName, String siteUsername, String password,
                            String userUsername){
        System.out.println(userUsername);
        Site site = new Site(siteName, siteUsername, password);
        User user = userMap.get(userUsername);
        user.addSite(siteName, site);
        System.out.println("new site made");
    }

    public ArrayList<String> getUserSites(String username){
        User user = userMap.get(username);
        return user.getSiteList();
    }

    public String getInfo(String siteName, String userUsername){
        System.out.println(siteName);
        User user = userMap.get(userUsername);
        System.out.println(user.getUsername());
        System.out.println(user.getInfo(siteName));
        Site site = user.getInfo(siteName);
        String returner = "{";
        returner+="\"name\":\"" + site.getName()+"\","+ "\"password\":\""+ site.getPassword()+ "\",\"username\":\""+ site.getUsername()+"\"";
        returner += "}";
        System.out.println(returner);
        return returner;
    }


}
