/**
 * 
 */
package org.tektutor.data.jpa.service;

import java.io.Serializable;

import lombok.Data;

/**
 * @author kxhb130
 *
 */
@Data
public class CityId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String country;
	
	private String name;
}
