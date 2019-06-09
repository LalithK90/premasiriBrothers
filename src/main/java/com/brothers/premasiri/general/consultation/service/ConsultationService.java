package com.brothers.premasiri.general.consultation.service;


import com.brothers.premasiri.general.consultation.dao.ConsultationDao;
import com.brothers.premasiri.general.consultation.entity.Consultations;
import com.brothers.premasiri.util.interfaces.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ConsultationService implements AbstractService<Consultations, Integer> {

    private ConsultationDao consultationDao;

    @Autowired
    public ConsultationService(ConsultationDao consultationDao){
        this.consultationDao = consultationDao;
    }


    @Transactional
    public List<Consultations> findAll() {
        return consultationDao.findAll();
    }

    @Transactional
    public Consultations findById(Integer id) {
        return consultationDao.getOne(id);
    }

    @Transactional
    public Consultations persist(Consultations consultations) {
        return consultationDao.save(consultations);
    }

    @Transactional
    public boolean delete(Integer id) {
        consultationDao.deleteById(id);
        return false;
    }

    @Transactional
    public List<Consultations> search(Consultations consultations) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Consultations> consultationExample = Example.of(consultations, matcher);
        return consultationDao.findAll(consultationExample);
    }
}
