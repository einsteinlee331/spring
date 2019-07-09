// 위에 eintities는 그냥 저장소이고 , 이 값을 관리하는 것은 repositories, 설정값은 customer에 담김.
package com.bitcamp.web.repositories;

import com.bitcamp.web.entities.Customer;

import org.hibernate.type.LongType;
import org.springframework.data.repository.CrudRepository;

/**
 * CustomerRepository
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}