package cat.tecnocampus.filterChain;

public class FilterProxySubChain implements Filter {
    private final FilterChain subChain;

    public FilterProxySubChain(FilterChain subChain) {
        this.subChain = subChain;
    }
    @Override
    public void doFilter(Request request, Response response, FilterChain mainChain) {
        subChain.doFilter(request, response, subChain);
        mainChain.doFilter(request, response, mainChain);
    }
}
