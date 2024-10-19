package cat.tecnocampus.filterChain;

public class Response {
    private String response;

    public Response(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void concatResponse(String response) {
        this.response += response;
    }
}
