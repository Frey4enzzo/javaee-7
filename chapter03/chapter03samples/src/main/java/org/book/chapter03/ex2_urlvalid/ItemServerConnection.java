package org.book.chapter03.ex2_urlvalid;

/**
 * Задача: ограничить атрибут itemURL так, чтобы
 * он работал только с http ис хостом, имя которого начинается с www.zato-zvezdny.ru
 */

import javax.validation.constraints.NotNull;
import java.util.Date;

public class ItemServerConnection {

    @URL
    private String resourceURL;
    @NotNull @URL(protocol = "http", host = "www.zato-zvezdny.ru")
    private String itemURL;
    @URL(protocol = "ftp", port = 21)
    private String ftpServerURL;
    private Date lastConnectionDate;

    public ItemServerConnection() {
    }

    public String getResourceURL() {
        return resourceURL;
    }

    public void setResourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
    }

    public String getItemURL() {
        return itemURL;
    }

    public void setItemURL(String itemURL) {
        this.itemURL = itemURL;
    }

    public String getFtpServerURL() {
        return ftpServerURL;
    }

    public void setFtpServerURL(String ftpServerURL) {
        this.ftpServerURL = ftpServerURL;
    }

    public Date getLastConnectionDate() {
        return lastConnectionDate;
    }

    public void setLastConnectionDate(Date lastConnectionDate) {
        this.lastConnectionDate = lastConnectionDate;
    }
}
