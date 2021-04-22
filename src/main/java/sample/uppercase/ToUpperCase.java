package sample.uppercase;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class ToUpperCase implements RequestHandler<Map<String, String>, Map<String, String>> {

  private static final Logger log = LoggerFactory.getLogger(ToUpperCase.class);

  @Override
  public Map<String, String> handleRequest(Map<String, String> input, Context context) {
    LambdaLogger logger = context.getLogger();
    log.error("log.errorrrrrrrrrr");
    log.error("log.warn");
    Map<String, String> response = new HashMap<>();
    response.put("person_id", input.get("person_id"));
    response.put("name", input.get("name").toUpperCase());
    response.put("message", "Upper Success!!");
    return response;
  }
}
