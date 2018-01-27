/**
 * 
 */
package org.tektutor.data.jpa.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kxhb130
 *
 */
@Repository
public interface CityRepository extends PagingAndSortingRepository<City, String>{

}
