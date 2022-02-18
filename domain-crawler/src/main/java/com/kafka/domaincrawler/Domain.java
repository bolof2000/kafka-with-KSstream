package com.kafka.domaincrawler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Domain {

    private String domain;
    private String create_date;
    private String update_date;
    private String A;
    private String NS;
    private String CNAME;
    private String TXT;
    private String MX;
    private boolean isDead;
    private String country;
}
