package erick.TabelaFipe.service;


import java.util.List;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); // método genérico que recebe uma string e converte numa classe genérica

    <T> List<T> obterLista(String json, Class<T> classe); // método que cria uma lista de um tipo específico de acordo com a classe passada
}
