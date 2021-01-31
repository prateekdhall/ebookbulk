package main.java.com.mps.wiley.ebb.domain;


import com.kite.orm.annotation.Column;
import com.kite.orm.annotation.PrimaryKey;
import com.kite.orm.annotation.Table;


@Table(name = "WILEY_OFFICES")
@PrimaryKey(key = "id")
public class WileyOffices
{
	@Column(name = "OFFICE_ID")
	private Integer id;
	
	@Column(name = "OFFICE_NAME")
	private String name;
	
	@Column(name = "TIME_DIFF_TO_EST")
	private Double estDifference;
	
	/**
	 * @return the id
	 */
	public final Integer getId()
	{
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public final void setId(Integer id)
	{
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public final String getName()
	{
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public final void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * @return the estDifference
	 */
	public final Double getEstDifference()
	{
		return estDifference;
	}
	
	/**
	 * @param estDifference the estDifference to set
	 */
	public final void setEstDifference(Double estDifference)
	{
		this.estDifference = estDifference;
	}
}
