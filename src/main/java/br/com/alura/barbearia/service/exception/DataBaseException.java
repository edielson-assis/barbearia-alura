package br.com.alura.barbearia.service.exception;

public class DataBaseException extends RuntimeException {

    public DataBaseException(String msg) {
        super(msg);
    }
}