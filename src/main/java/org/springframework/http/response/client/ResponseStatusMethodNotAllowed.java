package org.springframework.http.response.client;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 405
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
public @interface ResponseStatusMethodNotAllowed {

  @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
  String reason() default "";
}
