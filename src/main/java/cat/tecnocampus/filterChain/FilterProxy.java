package cat.tecnocampus.filterChain;

import cat.tecnocampus.filterChain.Filter;
import cat.tecnocampus.filterChain.FilterChain;
import cat.tecnocampus.filterChain.Request;
import cat.tecnocampus.filterChain.Response;

public class FilterProxy implements Filter {
    private final FilterChain subChain;

    public FilterProxy(FilterChain subChain) {
        this.subChain = subChain;
    }
    @Override
    public void doFilter(Request request, Response response, FilterChain mainChain) {
        subChain.doFilter(request, response, subChain);
        mainChain.doFilter(request, response, mainChain);
    }
}
