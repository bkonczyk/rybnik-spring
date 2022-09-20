package pl.sda.firstspringproject.zoo.animal;

import lombok.Data;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class AnimalExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    ErrorResponse handleNoSuchElementException(NoSuchElementException e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getName());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    ErrorResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return null;
    }
}

@Data
class ErrorResponse {
    private final String message;
    private final String exception;
}