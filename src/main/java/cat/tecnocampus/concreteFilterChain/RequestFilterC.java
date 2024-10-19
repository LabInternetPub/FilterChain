package cat.tecnocampus.concreteFilterChain;

import cat.tecnocampus.filterChain.Filter;
import cat.tecnocampus.filterChain.FilterChain;
import cat.tecnocampus.filterChain.Request;
import cat.tecnocampus.filterChain.Response;

public class RequestFilterC implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.concatRequest("FilterC ");
        response.concatResponse("HeaderC ");
        filterChain.doFilter(request, response, filterChain);
    }
}
