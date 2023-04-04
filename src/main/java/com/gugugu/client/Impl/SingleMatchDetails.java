package com.gugugu.client.Impl;

import com.gugugu.client.MatchDetailResult;
import com.gugugu.config.SpringConfig;
import com.gugugu.dao.mapper.CreateMapper;
import com.gugugu.dao.mapper.Impl.ReadMapperImpl;
import com.gugugu.domain.DetailResult;
import com.gugugu.domain.Match;
import com.gugugu.domain.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class SingleMatchDetails {
    @Autowired
    private MatchDetailResult mdr;

    public Match getMatchDetails(Match aMatch) throws IOException {
        long matchId = aMatch.getMatchId();
        int binaryPlayers = aMatch.getBinaryPlayers();
        DetailResult dr = mdr.pullMatchDetail(String.valueOf(matchId));
        Match matchPojo = dr.getMatch();
        matchPojo.setMatchId(matchId);
        matchPojo.setBinaryPlayers(binaryPlayers);
        for (Player player: matchPojo.getPlayers()) {
            player.setMatchId(matchId);
        }
        return matchPojo;
    }

    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        SingleMatchDetails sm = ctx.getBean(SingleMatchDetails.class);
        ReadMapperImpl rmi = ctx.getBean(ReadMapperImpl.class);
        List<Match> matchList = rmi.SelectAllTeamMatch();
        CreateMapper createMapper = ctx.getBean(CreateMapper.class);
        List<String> playerList = new TeamMatch().getPlayersId(TeamMatch.filePath);
        int i = 0, l = matchList.size();
        for (Match newMatch: matchList) {
            Match match = sm.getMatchDetails(newMatch);
            createMapper.saveMatchDetails(match);
            for(Player player: match.getPlayers()) {
                if (playerList.contains(String.valueOf(player.getAccountId()))){
                    createMapper.savePlayersDetails(player);
                }
            }
            System.out.println(String.format("%d/%d 已经完成", ++i, l));
        }
    }
}
