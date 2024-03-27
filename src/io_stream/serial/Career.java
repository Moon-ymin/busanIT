package io_stream.serial;

import java.io.Serializable;

public class Career implements Serializable {
    String company;
    int years;

    public Career(String company, int years) {
        this.company = company;
        this.years = years;
    }

    @Override
    public String toString() {
        return "Career{" +
                "company='" + company + '\'' +
                ", years=" + years +
                '}';
    }
}
