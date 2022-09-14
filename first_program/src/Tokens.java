public class Tokens {
    private String token_value;
    private String token_type;
    
    public Tokens(String token_value, String token_type) {
        this.token_type = token_type;
        this.token_value = token_value;
    }

    public String getTokenType() {
        return token_type;
    }

    public String getTokenValue() {
        return token_value;
    }
}
