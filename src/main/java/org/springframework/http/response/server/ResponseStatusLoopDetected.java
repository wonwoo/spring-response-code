package org.springframework.http.response.server;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 508
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.LOOP_DETECTED)
public @interface ResponseStatusLoopDetected {

  @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
  String reason() default "";
}
