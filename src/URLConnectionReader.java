import java.net.*;
import java.io.*;

public class URLConnectionReader {
    public static String getText(String url) throws Exception {
        URL website = new URL("http://www.dublincity.ie/dublintraffic/cpdata.xml");
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                    connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            response.append(inputLine);

        in.close();

        return response.toString();
    }
        //Test
    public static void main(String[] args) throws Exception {
        String content = URLConnectionReader.getText(args[0]);
        System.out.println(content);
        
        //new stuff added on line 27 for testing
        //added new stuff
        
        //notes after line 29 has been removed
        //changes not sure if this is now the BranchTest or original
        //new changes
        
    }
}