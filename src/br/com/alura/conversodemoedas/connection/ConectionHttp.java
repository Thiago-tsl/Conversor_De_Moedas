package br.com.alura.conversodemoedas.connection;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConectionHttp {

    public JsonObject getJson() {
        String apiKey = "10953bc9501dba9fefcaad7d";
        String urlStr = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/BRL";
        try {
            URL url = new URL(urlStr);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser jsonParser = new JsonParser();
            JsonElement root = jsonParser.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonObject = root.getAsJsonObject();

            return jsonObject.get("conversion_rates").getAsJsonObject();
        }catch (Exception e){
            throw new RuntimeException("Não conesgui conectar com a API");
        }


    }


}
