package no.iterate.restify.rs;


import com.sun.jersey.spi.container.servlet.ServletContainer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Restify {

    public static void main(String[] args) throws Exception {
        int port = 5000;
        String envPort = System.getenv("PORT");
        if (envPort != null) {
            port = Integer.valueOf(envPort);
        }
        final Server server = new Server(port);

        final ServletHolder servletHolder = new ServletHolder(ServletContainer.class);

        servletHolder.setInitParameter(
                "com.sun.jersey.config.property.resourceConfigClass",
                "com.sun.jersey.api.core.PackagesResourceConfig");

        servletHolder.setInitParameter(
                "com.sun.jersey.config.property.packages",
                "no.iterate.restify.rs" +
                ";org.codehaus.jackson.jaxrs");

        servletHolder.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");


        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        context.addServlet(servletHolder, "/*");

        server.setHandler(context);

        server.start();
        server.join();
    }

}
