package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosFilme(
        @JsonAlias("Title") String titulo,
        @JsonAlias({"Runtime", "runTime"}) String totalDeMinutos,
        @JsonAlias({"Year", "yearOfRelease"}) String anoLancamento) {
}
