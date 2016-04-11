package org.springframework.http.response.informational;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 100
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.CONTINUE)
public @interface ResponseStatusContinue {

  @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
  String reason() default "";
}
