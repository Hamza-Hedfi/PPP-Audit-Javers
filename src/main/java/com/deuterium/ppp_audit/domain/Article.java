package com.deuterium.ppp_audit.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Article /* extends BaseEntity */{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String label;
    private String description;

    private BigDecimal unitPrice;
}
