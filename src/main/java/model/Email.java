package model;

public class Email {
    private String emailName;
    private String domainName;

    public Email(String emailName, String domainName) {
        this.emailName = emailName;
        this.domainName = domainName;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
}
