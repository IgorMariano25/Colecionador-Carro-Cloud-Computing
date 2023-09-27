package br.com.colecionador.api_carros.errorHandler;

import java.util.List;

public class ValidationErrorResponse {
    private String errorMessage = "Aconteceu um problema ao processar sua solicitação";
    private List<Validation> errors = new List<Validation>();

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<Validation> getErrors() {
        return this.errors;
    }

    public void setErrors(List<Validation> errors) {
        this.errors = errors;
    }

    public void addErrorValidation(String field, String message){
        this.errors.add(new Validation(field, message));
    }
}
