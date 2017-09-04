package org.book.chapter03.ex2_urlvalid;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.net.MalformedURLException;

public class URLValidator implements ConstraintValidator<URL, String>{

    private String protocol;
    private String host;
    private int port;

    public void initialize(URL url) {
        this.protocol = url.protocol();
        this.host = url.host();
        this.port = url.port();
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.length() == 0) {
            return true;
        }

        java.net.URL url;
        try {
            // преобразуем URL в java.net.URL для проверки на допустимость формата URL
            url = new java.net.URL(value);
        } catch (MalformedURLException e) {
            return false;
        }

        // проверяет, имеет ли атрибут протокола допустимое значение
        if (protocol != null && protocol.length() > 0 && !url.getProtocol().equals(protocol)) {
            return false;
        }
        if (port != -1 && url.getPort() != port) {
            return false;
        }
        return true;
    }
}
