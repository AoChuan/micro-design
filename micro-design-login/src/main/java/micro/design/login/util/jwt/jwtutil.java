package micro.design.login.util.jwt;

import io.jsonwebtoken.Claims;

public interface jwtutil {
    String createToken();
    String parseToken(String token);
    Boolean isExpire(Claims claims);
}
