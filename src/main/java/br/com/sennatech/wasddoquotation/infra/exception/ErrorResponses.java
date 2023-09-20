package br.com.sennatech.wasddoquotation.infra.exception;

public class ErrorResponses {
    private String message;

    public ErrorResponses(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}