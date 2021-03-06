package org.springframework.http.response.informational;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 101
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.SWITCHING_PROTOCOLS)
public @interface ResponseStatusSwitchingProtocols {

  @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
  String reason() default "";
}
