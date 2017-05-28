package org.openshift;

import java.util.HashMap;
import javax.enterprise.context.RequestedScope;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestedScoped
@Path("/insult")
Public class InsultResource {

  @GET()
  @Produces("application/json")
  public HashMap<String,String> getInsult() {
  HashMap<String, String> theInsult = new HashMap<String, String>();
  theInsult.put("insult", new InsultGenerator().generateInsult());
  return theInsult;
  }
}
