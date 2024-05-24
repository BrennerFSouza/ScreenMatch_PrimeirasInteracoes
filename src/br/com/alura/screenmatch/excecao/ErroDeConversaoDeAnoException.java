package br.com.alura.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoException(String messagem) {
        this.mensagem = messagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
