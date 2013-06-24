/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.infostat.data.dto;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author boubad
 */
@XmlRootElement(name="datetime")
public class DateDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer year = new Integer(0);
    private Integer month = new Integer(0);;
    private Integer day = new Integer(0);;
    private Integer hour = new Integer(0);;
    private Integer minute = new Integer(0);;
    private Integer second = new Integer(0);;

    //
    public DateDTO() {
    }

    public DateDTO(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public DateDTO(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    //
    @XmlAttribute
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
     @XmlAttribute
    public Integer getMonth() {
        return month;
    }
     
    public void setMonth(Integer month) {
        this.month = month;
    }
     @XmlAttribute
    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
     @XmlAttribute
    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
     @XmlAttribute
    public Integer getMinute() {
        return minute;
    }
     
    public void setMinute(Integer minute) {
        this.minute = minute;
    }
     @XmlAttribute
    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.year);
        hash = 71 * hash + Objects.hashCode(this.month);
        hash = 71 * hash + Objects.hashCode(this.day);
        hash = 71 * hash + Objects.hashCode(this.hour);
        hash = 71 * hash + Objects.hashCode(this.minute);
        hash = 71 * hash + Objects.hashCode(this.second);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DateDTO other = (DateDTO) obj;
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        if (!Objects.equals(this.month, other.month)) {
            return false;
        }
        if (!Objects.equals(this.day, other.day)) {
            return false;
        }
        if (!Objects.equals(this.hour, other.hour)) {
            return false;
        }
        if (!Objects.equals(this.minute, other.minute)) {
            return false;
        }
        if (!Objects.equals(this.second, other.second)) {
            return false;
        }
        return true;
    }

    
   
    
}// class DateDTO
