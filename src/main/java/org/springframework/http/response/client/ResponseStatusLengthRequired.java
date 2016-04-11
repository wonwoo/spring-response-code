package org.springframework.http.response.client;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 411
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.LENGTH_REQUIRED)
public @interface ResponseStatusLengthRequired {

  @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
  String reason() default "";
}
