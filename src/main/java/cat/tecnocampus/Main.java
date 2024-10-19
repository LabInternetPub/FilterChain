package cat.tecnocampus;

import cat.tecnocampus.concreteFilterChain.*;
import cat.tecnocampus.filterChain.FilterChain;
import cat.tecnocampus.filterChain.FilterProxySubChain;
import cat.tecnocampus.filterChain.Request;
import cat.tecnocampus.filterChain.Response;

public class Main {
    public static void main(String[] args) {

        FilterChain securityChain = new FilterChain();
        securityChain.addFilter(new SecurityFilterA());
        securityChain.addFilter(new SecurityFilterB());
        securityChain.setTarget(new VoidTarget());

        FilterChain mainChain = new FilterChain();
        mainChain.addFilter(new RequestFilterA());
        // Security chain is added to the main chain
        FilterProxySubChain securityFilter = new FilterProxySubChain(securityChain);
        mainChain.addFilter(securityFilter);
        mainChain.addFilter(new RequestFilterB());
        mainChain.addFilter(new RequestFilterC());
        mainChain.setTarget(new TargetServlet());

        mainChain.doFilter(new Request("MyRequest "), new Response(""), mainChain);
    }
}