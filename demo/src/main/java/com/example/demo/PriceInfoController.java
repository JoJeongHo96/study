package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
//@RequestMapping("/priceInfo")
@RequiredArgsConstructor
public class PriceInfoController {

	 private final PriceInfoService priceInfoService;
	 
	    // 상품 가격으로 가격 정보를 찾기
//	    @GetMapping("/priceinfo")
//	    public List<PriceInfo> getPriceInfoByPrice(@RequestParam Integer goodPrice) {
//	    	
//	    	List<PriceInfo> result = priceInfoService.findByGoodPrice(goodPrice);
//	    	System.out.println("result :" + result.toString());
//	        return result;
//	    }
	    
	    
	    // 상품명으로 상품 정보를 찾기
	    @GetMapping("/getPriceInfoByGoodName")
	    public List<Object[]> getPriceInfoByGoodName(@RequestParam String goodName) {
	    	
	    	List<Object[]> result = priceInfoService.findByGoodName(goodName);
	    	System.out.println("result :" + result.toString());
	        return result;
	    }
	    
	    // 키워드를 포함하는 상품목록 리스트출력
	    @GetMapping("/getDistinctGoodNames")
	    public List<String> getDistinctGoodNames(@RequestParam String goodName) {
	    	
	    	List<String> result = priceInfoService.findDistinctGoodNames(goodName);
	    	System.out.println("result :" + result.toString());
	        return result;
	    }
}
