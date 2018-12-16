package br.com.diegodelmiro.receita.api;

import br.com.diegodelmiro.receita.model.Resposta;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Controller {

    private static final String BASE_URL = "https://www.receitaws.com.br/v1/";

    public Resposta buscarCnpj(String cnpj) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Resorce resorceApi = retrofit.create(Resorce.class);

        Call<Resposta> call = resorceApi.findCnpj(cnpj);
        try {
            return call.execute().body();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;

    }

}
