package micro.design.login.util.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import micro.design.login.util.jwt.jwtutil;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Jwtutilimpl implements jwtutil {


    @Override
    public String createToken() {
        String token = Jwts.builder()
                .setId("test1") //playload
                .setAudience("张三")
                .setIssuedAt(new Date())
                .setSubject("robot")
                .setExpiration(new Date(new Date().getTime()+1000*60*60*24))
                .setHeaderParam("牛逼", "666") //header
                .signWith(SignatureAlgorithm.HS256, "牛逼666") //signature
                .compact();
        return token;
    }

    @Override
    public String parseToken(String token) {
        String tokenString = Jwts.parser()
                .setSigningKey("牛逼666")
                .parseClaimsJws(token)
                .getBody().toString();

        return tokenString;
    }

    @Override
    public Boolean isExpire(Claims claims) {
        return claims.getExpiration().before(new Date());
    }
}
