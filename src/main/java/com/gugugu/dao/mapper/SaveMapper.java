package com.gugugu.dao.mapper;

import com.gugugu.domain.Hero;
import com.gugugu.domain.Match;
import org.apache.ibatis.annotations.Insert;

public interface SaveMapper {

    void save(Hero hero);

    void saveMatchId(Match match);
}
