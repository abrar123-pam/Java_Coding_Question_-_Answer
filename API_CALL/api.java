package API_CALL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class api {
    public static void main(String[] args) {
        try {
            String url ="https://jsonplaceholder.typicode.com/users";
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");

            int rc = connection.getResponseCode();
            System.out.println("Response code :: "+rc);

            if(rc == HttpURLConnection.HTTP_OK){
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println(response.toString());

            }else {
                System.out.println("GET request not worked");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
