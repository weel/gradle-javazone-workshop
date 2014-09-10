package no.iterate.restify.rs;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

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
                "jersey.config.server.provider.packages",
                "no.iterate.restify.rs" +
                        ";org.codehaus.jackson.jaxrs");


        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        context.addServlet(servletHolder, "/*");

        server.setHandler(context);

        server.start();
        server.join();
    }

}