package com.xn.springbootdemo.repo;

import com.xn.springbootdemo.dto.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author XiaoNing
 * @date 2021/1/22
 */
public interface OpportunityRepo extends JpaRepository<Opportunity,Long> {

}
