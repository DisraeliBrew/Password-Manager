// --== CS400 File Header Information ==--
// Name: Taylor Mehmen
// Email: tmehmen@wisc.edu
// Team: LD
// Role: BackEnd
// TA: Divyanshu
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>


import java.util.ArrayList;

public class FrontTest {
    public static void main(String[] args){
        DataProcessor processor = new DataProcessor();
        processor.createUser("Taylor", "password123");
        processor.createUser("Anush", "password123");
        System.out.println(processor.enterUsername("Taylor"));
        System.out.println(processor.enterUsername("Zahaan"));
        System.out.println(processor.enterPassword("Taylor", "password123"));
        System.out.println(processor.enterPassword("Taylor", "pssword123"));
        processor.addUserSite("Twitter", "@taylorTwitter",
                "password123", "Taylor");
        processor.addUserSite("Facebook", "Taylor Mehmen",
                "password123", "Taylor");
        ArrayList<String> sites = processor.getUserSites("Taylor");
        System.out.println(sites);
        //Site testSite = processor.getInfo("Twitter", "Taylor");
        //System.out.println(testSite.getName());
        //System.out.println(testSite.getUsername());
        //System.out.println(testSite.getPassword());
    }
}
