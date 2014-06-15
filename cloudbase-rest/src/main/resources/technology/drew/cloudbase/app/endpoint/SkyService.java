package technology.drew.cloudbase.app.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Service
@Path("/sky")
public class SkyService {

@GET
@Path("/{number}")
@Produces("text/plain")
public boolean getMySky(@PathParam("number") int number){
	return true;
}
	
}
