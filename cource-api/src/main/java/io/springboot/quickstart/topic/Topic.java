package io.springboot.quickstart.topic;

public class Topic {

	private String id;
	private String name;
	private String Description;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
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
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}
	/**
	 * @param id
	 * @param name
	 * @param description
	 */
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
	}
	
	/**
	 * 
	 */
	public Topic() {
			
	}
}
