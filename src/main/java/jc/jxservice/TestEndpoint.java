package jc.jxservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestEndpoint {
  @Value("${test.endpoint.message}")
  String message;

  @RequestMapping("/")
  public String home() {
    return message;
  }

}
