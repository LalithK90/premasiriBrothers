package com.brothers.premasiri.asset.process.goodReceivingManagement.entity;

import com.brothers.premasiri.util.audit.AuditEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode( callSuper = true )
public class GoodReceivingManagement extends AuditEntity {

    private String quantity;

    private String itemPrice;
    //todo-> need more thing

//todo -> supplier medicine

}



