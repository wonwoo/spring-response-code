package org.springframework.http.response.server;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 500
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public @interface ResponseStatusInternalServerError {

  @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
  String reason() default "";
}
