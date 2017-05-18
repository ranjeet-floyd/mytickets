package com.futurefry.mytickets.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ranjeet
 */
@Entity
@Table(name = "ticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ticket.findAll", query = "SELECT t FROM Ticket t")
    , @NamedQuery(name = "Ticket.findById", query = "SELECT t FROM Ticket t WHERE t.id = :id")
    , @NamedQuery(name = "Ticket.findByUserId", query = "SELECT t FROM Ticket t WHERE t.userId = :userId")
    , @NamedQuery(name = "Ticket.findByFromCity", query = "SELECT t FROM Ticket t WHERE t.fromCity = :fromCity")
    , @NamedQuery(name = "Ticket.findByToCity", query = "SELECT t FROM Ticket t WHERE t.toCity = :toCity")
    , @NamedQuery(name = "Ticket.findByTravelDate", query = "SELECT t FROM Ticket t WHERE t.travelDate = :travelDate")
    , @NamedQuery(name = "Ticket.findByTravelTime", query = "SELECT t FROM Ticket t WHERE t.travelTime = :travelTime")
    , @NamedQuery(name = "Ticket.findByContactNumber", query = "SELECT t FROM Ticket t WHERE t.contactNumber = :contactNumber")
    , @NamedQuery(name = "Ticket.findByUpdatedDate", query = "SELECT t FROM Ticket t WHERE t.updatedDate = :updatedDate")
    , @NamedQuery(name = "Ticket.findByCreatedDate", query = "SELECT t FROM Ticket t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "Ticket.findByFlightNumber", query = "SELECT t FROM Ticket t WHERE t.flightNumber = :flightNumber")})
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "userId")
    private String userId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fromCity")
    private String fromCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "toCity")
    private String toCity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "travelDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date travelDate;
    @Size(max = 45)
    @Column(name = "travelTime")
    private String travelTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "contactNumber")
    private String contactNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "updatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "createdDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "flightNumber")
    private String flightNumber;

    public Ticket() {
    }

    public Ticket(Long id) {
        this.id = id;
    }

    public Ticket(Long id, String userId, String fromCity, String toCity, Date travelDate, String contactNumber, Date updatedDate, Date createdDate, String flightNumber) {
        this.id = id;
        this.userId = userId;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.travelDate = travelDate;
        this.contactNumber = contactNumber;
        this.updatedDate = updatedDate;
        this.createdDate = createdDate;
        this.flightNumber = flightNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.futurefry.mytickets.entity.Ticket[ id=" + id + " ]";
    }
    
}
