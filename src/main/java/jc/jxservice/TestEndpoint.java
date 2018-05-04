package jc.jxservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestEndpoint {

  @Autowired
  private MyConfig config;

  @RequestMapping("/")
  public String home() {
    return config.getMessage();
  }

}
