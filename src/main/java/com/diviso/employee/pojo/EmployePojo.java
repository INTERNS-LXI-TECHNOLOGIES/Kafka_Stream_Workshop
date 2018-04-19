package com.diviso.employee.pojo;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author vineeth
 * Apr 18, 2018 10:06:51 AM
 *
 */

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployePojo {

	private int  id;
	private String name;
	private String[] status= {"SUCCESS", "FAILD", "PROCESS", "NO_RESPONSE", "TRY_LATER"};
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployePojo [id=" + id + ", name=" + name + ", status=" + Arrays.toString(status) + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the status
	 */
	public String[] getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String[] status) {
		this.status = status;
	}
	
	
	
	
}
