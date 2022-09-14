package poject.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RequestUrlProcessing {

    public static StringBuffer test(String order) throws IOException {
        String url = "https://catery.ru/api/internal/v1/orders/" + order + "?secret=4a3c12c3a6a219849bb0c85054ccc7867953387afb411356bda87452a50c39344";
        URL urlObj;
        HttpURLConnection connection;
        BufferedReader reader;
        String input;
        StringBuffer response = new StringBuffer();
        try {
            urlObj = new URL(url);
            connection = (HttpURLConnection) urlObj.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while ((input = reader.readLine()) != null) {
            response.append(input);
        }
        return response;
    }

}
