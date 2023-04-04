package com.gugugu.dao.mapper.Impl;

import com.gugugu.dao.mapper.ReadMapper;
import com.gugugu.domain.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReadMapperImpl implements ReadMapper {
    @Autowired
    ReadMapper readMapper;

    @Override
    public List<Match> SelectAllTeamMatch() {
        return readMapper.SelectAllTeamMatch();
    }
}
