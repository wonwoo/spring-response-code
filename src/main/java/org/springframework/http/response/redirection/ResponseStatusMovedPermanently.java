package org.springframework.http.response.redirection;

import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

/**
 * http code 301
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
public @interface ResponseStatusMovedPermanently {

  @AliasFor(annotation = ResponseStatus.class, attribute = "reason")
  String reason() default "";
}
