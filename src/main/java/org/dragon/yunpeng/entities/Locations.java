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
 * JPA entity class for "Locations"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="LOCATIONS", schema="HR" )
public class Locations implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="LOCATION_ID", nullable=false)
    private BigDecimal locationId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="STREET_ADDRESS", length=40)
    private String     streetAddress ;

    @Column(name="POSTAL_CODE", length=12)
    private String     postalCode ;

    @Column(name="CITY", nullable=false, length=30)
    private String     city ;

    @Column(name="STATE_PROVINCE", length=25)
    private String     stateProvince ;

    @Column(name="COUNTRY_ID", length=2)
    private String     countryId ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy="locations")
    private List<Departments> listOfDepartments ; 

    @ManyToOne
    @JoinColumn(name="COUNTRY_ID", referencedColumnName="COUNTRY_ID", insertable=false, updatable=false)
    private Countries  countries ; 


    /**
     * Constructor
     */
    public Locations() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setLocationId( BigDecimal locationId ) {
        this.locationId = locationId ;
    }
    public BigDecimal getLocationId() {
        return this.locationId;
    }

    public void setStreetAddress( String streetAddress ) {
        this.streetAddress = streetAddress ;
    }
    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setPostalCode( String postalCode ) {
        this.postalCode = postalCode ;
    }
    public String getPostalCode() {
        return this.postalCode;
    }

    public void setCity( String city ) {
        this.city = city ;
    }
    public String getCity() {
        return this.city;
    }

    public void setStateProvince( String stateProvince ) {
        this.stateProvince = stateProvince ;
    }
    public String getStateProvince() {
        return this.stateProvince;
    }

    public void setCountryId( String countryId ) {
        this.countryId = countryId ;
    }
    public String getCountryId() {
        return this.countryId;
    }

    //--- GETTERS FOR LINKS
    public List<Departments> getListOfDepartments() {
        return this.listOfDepartments;
    } 

    public Countries getCountries() {
        return this.countries;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(locationId);
        sb.append("|");
        sb.append(streetAddress);
        sb.append("|");
        sb.append(postalCode);
        sb.append("|");
        sb.append(city);
        sb.append("|");
        sb.append(stateProvince);
        sb.append("|");
        sb.append(countryId);
        return sb.toString(); 
    } 

}
