package br.com.diegodelmiro.receita.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AtividadeSecundaria implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("text")
    private String descricao;

    @SerializedName("code")
    private String codigo;


}
