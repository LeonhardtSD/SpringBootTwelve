package com.gaozhaoxi.springboottwelve.entity;

import javax.persistence.*;
import java.nio.channels.Pipe;

/**
 * @author Leon
 */
@Entity
public class SysRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    public SysRole(){

    }
    public SysRole(Long id, String name ){
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
