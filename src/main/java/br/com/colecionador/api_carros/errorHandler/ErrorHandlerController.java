package br.com.colecionador.api_carros.errorHandler;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandlerController {
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ValidationErrorResponse validationErrorHandler(MethodArgumentNotValidException e){
        ValidationErrorResponse result = new ValidationErrorResponse();

        for (FieldError error : e.getBindingResult().getFieldErrors()) {
            result.addErrorValidation(error.getField(), error.getDefaultMessage());
        }

        return result;
    }
}
