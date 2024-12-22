package com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); // Algum dado será devolvido (não se sabe o que)
}
