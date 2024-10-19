package cat.tecnocampus.concreteFilterChain;

import cat.tecnocampus.filterChain.Request;
import cat.tecnocampus.filterChain.Response;
import cat.tecnocampus.filterChain.Target;

public class TargetServlet implements Target {
    @Override
    public void execute(Request request, Response response) {
        System.out.println("Requested: " + request.getRequest());
        System.out.println("Responded: servletWork " + response.getResponse());
    }
}
