package cat.tecnocampus.concreteFilterChain;

import cat.tecnocampus.filterChain.Filter;
import cat.tecnocampus.filterChain.FilterChain;
import cat.tecnocampus.filterChain.Request;
import cat.tecnocampus.filterChain.Response;

public class SecurityFilterA implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.concatRequest("SecurityA ");
        response.concatResponse("SecurityA ");
        filterChain.doFilter(request, response, filterChain);
    }
}
