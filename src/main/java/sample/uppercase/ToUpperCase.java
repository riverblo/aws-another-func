package sample.uppercase;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ToUpperCase implements RequestHandler<PersonRequest, PersonResponse> {

  @Override
  public PersonResponse handleRequest(PersonRequest input, Context context) {

    PersonResponse res = new PersonResponse();
    res.setPerson_id(input.getPerson_id());
    res.setName(input.getName().toUpperCase());
    res.setMessage("Upper Success!!");
    return res;
  }
}
