package cat.tecnocampus.filterChain;

import java.util.ArrayList;

public class FilterChain {
    private Target target;
    private ArrayList<Filter> filters;
    private int currentFilter;

    public FilterChain() {
        filters = new ArrayList<Filter>();
        currentFilter = 0;
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (currentFilter < filters.size()) {
            filters.get(currentFilter++).doFilter(request, response, filterChain);
        } else {
            target.execute(request, response);
        }
    }

}
