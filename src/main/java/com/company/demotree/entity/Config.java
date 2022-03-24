package com.company.demotree.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "DMT_CONFIG")
@Entity(name = "dmt_Config")
public class Config {

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "CONF_TYPE", nullable = false)
    @NotNull
    private String confType;

    @Column(name = "CONF_VALUE", nullable = false)
    @NotNull
    private String confValue;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @JoinColumn(name = "PARENT_CONFIG_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Config parentConfig;

    public Config getParentConfig() {
        return parentConfig;
    }

    public void setParentConfig(Config parentConfig) {
        this.parentConfig = parentConfig;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfValue() {
        return confValue;
    }

    public void setConfValue(String confValue) {
        this.confValue = confValue;
    }

    public String getConfType() {
        return confType;
    }

    public void setConfType(String confType) {
        this.confType = confType;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}