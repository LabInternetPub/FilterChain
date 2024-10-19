package cat.tecnocampus.filterChain;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
