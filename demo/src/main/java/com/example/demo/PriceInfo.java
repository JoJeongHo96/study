package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "price_info")
@Data
@NoArgsConstructor
public class PriceInfo {
	
    @Id // 식별자 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가 설정 (MySQL에서는 주로 사용)
    private Long id;
    
    @Column(name = "goodName", length = 70)
    private String goodName;

    @Column(name = "goodPrice")
    private Integer goodPrice;

    @Column(name = "retail", length = 100)
    private String retail;

    @Column(name = "producer", length = 100)
    private String producer;

}
