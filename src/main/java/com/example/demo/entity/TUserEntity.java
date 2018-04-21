package com.example.demo.entity;

import javax.persistence.*;

/**
 * Created by zhumingfang on 2018/4/19.
 */
@Entity
@Table(name = "t_user", schema = "spring_boot", catalog = "")
public class TUserEntity {
    private long tId;
    private String tName;
    private Integer tAge;
    private String tAddress;

    @Id
    @Column(name = "t_id", nullable = false)
    public long gettId() {
        return tId;
    }

    public void settId(long tId) {
        this.tId = tId;
    }

    @Basic
    @Column(name = "t_name", nullable = true, length = 30)
    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Basic
    @Column(name = "t_age", nullable = true)
    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    @Basic
    @Column(name = "t_address", nullable = true, length = 100)
    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        TUserEntity that = (TUserEntity) o;
//
//        if (tId != that.tId) return false;
//        if (tName != null ? !tName.equals(that.tName) : that.tName != null) return false;
//        if (tAge != null ? !tAge.equals(that.tAge) : that.tAge != null) return false;
//        if (tAddress != null ? !tAddress.equals(that.tAddress) : that.tAddress != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = tId;
//        result = 31 * result + (tName != null ? tName.hashCode() : 0);
//        result = 31 * result + (tAge != null ? tAge.hashCode() : 0);
//        result = 31 * result + (tAddress != null ? tAddress.hashCode() : 0);
//        return result;
//    }
}
