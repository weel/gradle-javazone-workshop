package no.iterate.restify.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Path("/") // This controller should handle requests to "/"
@Produces({MediaType.APPLICATION_JSON}) // This is the list of mediatypes that we support
public class RootResource {

	@GET // Handler for GET-requests
	public Response getProjectRootResource(){
		
		List<ExampleEntity> entities = new ArrayList<RootResource.ExampleEntity>();
		entities.add(new ExampleEntity("Alice Example", 42));
		entities.add(new ExampleEntity("Bob Example", 52));

		return Response.ok(entities).build();
	}
	
	/***
	 * This is just for showing serializing class instances / beans
	 * to JSON.
	 * 
	 *  If you want to serialize something to XML, it might require
	 *  some annotations, but it's pretty simple.
	 */
	class ExampleEntity {
		private final String name;
		private final int age;
		
		ExampleEntity(String name, int age){
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
	}
}
