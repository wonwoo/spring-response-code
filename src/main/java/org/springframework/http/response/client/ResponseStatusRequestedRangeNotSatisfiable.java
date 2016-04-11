package org.springframework.http.response.client;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 416
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE)
public @interface ResponseStatusRequestedRangeNotSatisfiable {

  @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
  String reason() default "";
}
