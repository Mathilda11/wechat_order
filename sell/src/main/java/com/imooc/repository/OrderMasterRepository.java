package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 54060 on 2018/9/3.
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String>{

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
