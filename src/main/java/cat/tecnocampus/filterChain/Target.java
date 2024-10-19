package cat.tecnocampus.filterChain;

public interface Target {
    void execute(Request request, Response response);
}
