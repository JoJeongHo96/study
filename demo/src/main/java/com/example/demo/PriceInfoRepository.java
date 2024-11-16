package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceInfoRepository extends JpaRepository<PriceInfo, Long> {

	List<PriceInfo> findByGoodPrice(Integer goodPrice);

	List<PriceInfo> findByRetail(String retail);

//    @Query("SELECT new com.example.demo.PriceInfoDTO(pi.goodName, MIN(pi.goodPrice)) " +
//    	       "FROM PriceInfo pi " +
//    	       "WHERE pi.goodName LIKE %:goodName% " +
//    	       "GROUP BY pi.goodName")
//    List<PriceInfoDTO> findByGoodNameContaining(String goodName);

    @Query("SELECT pi.goodName, MIN(pi.goodPrice) FROM PriceInfo pi WHERE pi.goodName = :goodName GROUP BY pi.goodName")
	List<Object[]> findByGoodName(@Param("goodName") String goodName);

	@Query("SELECT DISTINCT pi.goodName FROM PriceInfo pi WHERE pi.goodName LIKE %:goodName%")
	List<String> findDistinctGoodNames(@Param("goodName") String goodName);

}
