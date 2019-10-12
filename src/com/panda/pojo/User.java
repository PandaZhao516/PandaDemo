/**

*@description TODO
*@author Panda

 */
package com.panda.pojo;

import java.io.Serializable;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019Äê10ÔÂ12ÈÕ
 */
public class User implements Serializable{
	private int id;
    private String username;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
    
    
}
