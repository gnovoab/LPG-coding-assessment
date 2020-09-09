
//Namespace
package com.lpg.assesment.controller.handler;

//Imports
import com.lpg.assesment.domain.api.ApiErrorResponse;
import com.lpg.assesment.exception.ResourceNotFoundException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * Class that generates the HTTP response when an Runtime exception occur
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class CustomResponseEntityExceptionHandler {

    @ExceptionHandler(value = {ResourceNotFoundException.class})
    public ResponseEntity<ApiErrorResponse> exceptionHandler(ResourceNotFoundException e, WebRequest request) {
        return new ResponseEntity<>(new ApiErrorResponse(HttpStatus.NOT_FOUND, e.getMessage()), HttpStatus.NOT_FOUND);
    }

}
