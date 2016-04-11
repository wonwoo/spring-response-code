package org.springframework.http.response.server;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 501
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
public @interface ResponseStatusNotImplemented {

  @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
  String reason() default "";
}
