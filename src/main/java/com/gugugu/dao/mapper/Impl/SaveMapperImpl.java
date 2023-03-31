package com.gugugu.dao.mapper.Impl;

import com.gugugu.config.SpringConfig;
import com.gugugu.dao.mapper.SaveMapper;
import com.gugugu.domain.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SaveMapperImpl {

    @Autowired
    SaveMapper saveMapper;

    public void save(Hero hero) {
        saveMapper.save(hero);
    }

}
