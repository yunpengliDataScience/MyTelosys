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
 * JPA entity class for "Jobs"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="JOBS", schema="HR" )
public class Jobs implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="JOB_ID", nullable=false, length=10)
    private String     jobId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="JOB_TITLE", nullable=false, length=35)
    private String     jobTitle ;

    @Column(name="MIN_SALARY")
    private BigDecimal minSalary ;

    @Column(name="MAX_SALARY")
    private BigDecimal maxSalary ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy="jobs")
    private List<Employees> listOfEmployees ; 

    @OneToMany(mappedBy="jobs")
    private List<JobHistory> listOfJobHistory ; 


    /**
     * Constructor
     */
    public Jobs() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setJobId( String jobId ) {
        this.jobId = jobId ;
    }
    public String getJobId() {
        return this.jobId;
    }

    public void setJobTitle( String jobTitle ) {
        this.jobTitle = jobTitle ;
    }
    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setMinSalary( BigDecimal minSalary ) {
        this.minSalary = minSalary ;
    }
    public BigDecimal getMinSalary() {
        return this.minSalary;
    }

    public void setMaxSalary( BigDecimal maxSalary ) {
        this.maxSalary = maxSalary ;
    }
    public BigDecimal getMaxSalary() {
        return this.maxSalary;
    }

    //--- GETTERS FOR LINKS
    public List<Employees> getListOfEmployees() {
        return this.listOfEmployees;
    } 

    public List<JobHistory> getListOfJobHistory() {
        return this.listOfJobHistory;
    } 

    //--- toString specific method
	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(jobId);
        sb.append("|");
        sb.append(jobTitle);
        sb.append("|");
        sb.append(minSalary);
        sb.append("|");
        sb.append(maxSalary);
        return sb.toString(); 
    } 

}
