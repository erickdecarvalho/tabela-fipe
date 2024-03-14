package erick.TabelaFipe.service;


public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); // método genérico que recebe uma string e converte numa classe genérica/
}
