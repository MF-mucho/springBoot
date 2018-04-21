package com.example.demo.jpa;

import com.example.demo.entity.TUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by zhumingfang on 2018/4/19.
 */
public interface UserJPA extends JpaRepository<TUserEntity,Long>,JpaSpecificationExecutor<TUserEntity>,Serializable{

}
