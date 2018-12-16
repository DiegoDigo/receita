package br.com.diegodelmiro.receita.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class QuadroSocialAdministrador implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("qual")
    private String codigo;
    private String nome;
}
