package com.efrei.tp2springcomponent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "library")
public class GestionProfil {

    private int maxBooksByUser;
    private int maxLoanDurationInDays;


    public int getMaxBooksByUser() {
        return maxBooksByUser;
    }

    public void setMaxBooksByUser(int maxBooksByUser) {
        this.maxBooksByUser = maxBooksByUser;
    }

    public int getMaxLoanDurationInDays() {
        return maxLoanDurationInDays;
    }

    public void setMaxLoanDurationInDays(int maxLoanDurationInDays) {
        this.maxLoanDurationInDays = maxLoanDurationInDays;
    }

    @Override
    public String toString() {
        return "LibraryProperties{" +
                "maxBooksByUser=" + maxBooksByUser +
                ", maxLoanDurationInDays=" + maxLoanDurationInDays +
                '}';
    }
}
