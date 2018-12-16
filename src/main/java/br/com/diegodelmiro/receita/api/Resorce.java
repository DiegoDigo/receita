package br.com.diegodelmiro.receita.api;


import br.com.diegodelmiro.receita.model.Resposta;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Resorce {

    @GET("cnpj/{cnpj}")
    Call<Resposta> findCnpj(@Path("cnpj") String cnpj);
}
