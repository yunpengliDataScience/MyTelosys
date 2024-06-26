/*
 * Created on 2024-06-08 ( 13:47:26 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package org.dragon.yunpeng.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.*;

/**
 * JPA entity class for "Regions"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="REGIONS", schema="HR" )
public class Regions implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="REGION_ID", nullable=false)
    private BigDecimal regionId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="REGION_NAME", length=25)
    private String     regionName ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy="regions")
    private List<Countries> listOfCountries ; 


    /**
     * Constructor
     */
    public Regions() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setRegionId( BigDecimal regionId ) {
        this.regionId = regionId ;
    }
    public BigDecimal getRegionId() {
        return this.regionId;
    }

    public void setRegionName( String regionName ) {
        this.regionName = regionName ;
    }
    public String getRegionName() {
        return this.regionName;
    }

    //--- GETTERS FOR LINKS
    public List<Countries> getListOfCountries() {
        return this.listOfCountries;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(regionId);
        sb.append("|");
        sb.append(regionName);
        return sb.toString(); 
    } 

}
