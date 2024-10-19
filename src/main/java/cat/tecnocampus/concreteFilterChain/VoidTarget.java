package cat.tecnocampus.concreteFilterChain;

import cat.tecnocampus.filterChain.Request;
import cat.tecnocampus.filterChain.Response;
import cat.tecnocampus.filterChain.Target;

public class VoidTarget implements Target {
    @Override
    public void execute(Request request, Response response) {
        // Do nothing
    }
}
