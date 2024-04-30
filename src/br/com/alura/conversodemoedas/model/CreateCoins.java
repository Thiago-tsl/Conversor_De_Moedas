package br.com.alura.conversodemoedas.model;

import br.com.alura.conversodemoedas.connection.ConectionHttp;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;
import java.util.Locale;

public class CreateCoins {


    public Coins getCoins() {
        Gson gson = new GsonBuilder()
                .setFieldNamingStrategy(new FieldNamingStrategy() {
                    @Override
                    public String translateName(Field f) {
                        return f.getName().toUpperCase(Locale.ROOT);
                    }
                })
                .create();
        ConectionHttp conectionHttp = new ConectionHttp();
        Coins coins;
        return coins = gson.fromJson(conectionHttp.getJson(), Coins.class);
    }


}
