package com.brothers.premasiri.asset.process.generalLedger.entity;

import com.brothers.premasiri.util.audit.AuditEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode( callSuper = true )
public class Ledger extends AuditEntity {
    private String quantity;
    //todo => medicine

    //quantity price so many thing


}
