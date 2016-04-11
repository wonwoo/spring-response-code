package org.springframework.http.response.server;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 503
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
public @interface ResponseStatusServiceUnavailable {

  @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
  String reason() default "";
}
