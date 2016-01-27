import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("Hello World!");

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost= new HttpPost("http://localhost:8000");

        List<NameValuePair> params = new ArrayList<>(2);
        params.add(new BasicNameValuePair("emailAddress", "gihan.fernando@gmail.com"));
        httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

        try {
            CloseableHttpResponse response = httpclient.execute(httpPost);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
