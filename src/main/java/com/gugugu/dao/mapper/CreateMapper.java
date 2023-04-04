package com.gugugu.dao.mapper;

import com.gugugu.domain.Match;
import com.gugugu.domain.Player;

public interface CreateMapper {
    void saveMatchId(Match match);
    void saveMatchDetails(Match match);
    void savePlayersDetails(Player player);
}
