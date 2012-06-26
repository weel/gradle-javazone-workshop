package no.iterate.restify.rs;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map.Entry;

import javax.ws.rs.core.Response.Status;

import org.junit.Test;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;

public class RootResourceTest extends JerseyTest {
	
	// You should probably move this constructor to an abstract class,
	// so you don't have to type it for each and every test case
	public RootResourceTest() {
		super(new WebAppDescriptor.Builder()
        .contextPath("/")
        // Tell the servlet container where to find our rest handlers
        .initParam("com.sun.jersey.config.property.packages",
        		//  our resource package           binding for handling json
                "no.iterate.restify.rs" + ";org.codehaus.jackson.jaxrs")
         // Enable automatic mapping between POJO instances and JSON
        .initParam("com.sun.jersey.api.json.POJOMappingFeature", "true")
        // Enables match tracing
        .initParam("com.sun.jersey.config.feature.Trace", "true")
        .build());
	}
	
	
	@Test
	public void testRootResource() throws Exception {
		ClientResponse response = resource().path("/").get(ClientResponse.class);
		assertEquals("return 200 OK on GET", Status.OK.getStatusCode(), response.getStatus());
	}
	
	/***
	 * Look at stdout after running the test suite. 
	 */
	@Test
	public void demonstrateTracing() throws Exception {
		ClientResponse response = resource().path("/").get(ClientResponse.class);
		for ( Entry<String, List<String>> header : response.getHeaders().entrySet()) {
			System.out.println(header.getKey() + ": " + header.getValue().toString());
		}
	}
}
