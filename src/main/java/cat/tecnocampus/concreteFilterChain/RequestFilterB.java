package cat.tecnocampus.concreteFilterChain;

import cat.tecnocampus.filterChain.Filter;
import cat.tecnocampus.filterChain.FilterChain;
import cat.tecnocampus.filterChain.Request;
import cat.tecnocampus.filterChain.Response;

public class RequestFilterB implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.concatRequest("FilterB ");
        response.concatResponse("HeaderB ");
        filterChain.doFilter(request, response, filterChain);
    }
}
