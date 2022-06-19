package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

  @Test
  void testApplicationContext() {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

    Assertions.assertNotNull(applicationContext);

  }
}
