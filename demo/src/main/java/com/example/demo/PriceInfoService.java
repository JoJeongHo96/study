package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PriceInfoService {

	 private final PriceInfoRepository priceInfoRepository;
	 
	   // 상품 가격으로 찾기
	    public List<PriceInfo> findByGoodPrice(Integer goodPrice) {
	        return priceInfoRepository.findByGoodPrice(goodPrice);
	    }
	    
	 // 상품명으로 찾기
	    public List<Object[]> findByGoodName(String goodName) {
	        return priceInfoRepository.findByGoodName(goodName);
	    }
	    
	    public List<String> findDistinctGoodNames(String goodName) {
	        return priceInfoRepository.findDistinctGoodNames(goodName);
	    }
	    

}
