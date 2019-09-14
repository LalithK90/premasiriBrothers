package com.brothers.premasiri.asset.process.generalLedger.dao;


import com.brothers.premasiri.asset.process.generalLedger.entity.Ledger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LedgerDao extends JpaRepository< Ledger, Long > {
}
