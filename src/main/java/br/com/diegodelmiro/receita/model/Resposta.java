package br.com.diegodelmiro.receita.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Resposta implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("atividade_principal")
    private List<AtividadePrincial> atividadesPrincial;
    @SerializedName("data_situacao")
    private String dataSituacao;
    private String nome;
    private String uf;
    private String telefone;
    private String email;
    @SerializedName("atividades_secundarias")
    private List<AtividadeSecundaria> atividadesSecundaria;
    @SerializedName("qsa")
    private List<QuadroSocialAdministrador> quadroSocialAdministradores;
    private String situacao;
    private String bairro;
    private String logradouro;
    private String numero;
    private String cep;
    private String municipio;
    private String abertura;
    @SerializedName("natureza_juridica")
    private String naturezaJuridica;
    private String cnpj;
    @SerializedName("ultima_atualizacao")
    private String ultimaAtualizacao;
    private String status;
    private String tipo;
    private String fantasia;
    private String complemento;
    @SerializedName("efr")
    private String entesFederais;
    @SerializedName("motivo_situacao")
    private String motivoSituacao;
    @SerializedName("situacao_especial")
    private String situacaoEspecial;
    @SerializedName("data_situacao_especial")
    private String dataSituacaoEspecial;
    @SerializedName("capital_social")
    private String capitalSocial;
}
