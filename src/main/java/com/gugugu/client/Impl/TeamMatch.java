package com.gugugu.client.Impl;

import com.gugugu.client.MatchesHistoryResult;
import com.gugugu.config.SpringConfig;
import com.gugugu.dao.mapper.CreateMapper;
import com.gugugu.domain.HistoryResult;
import com.gugugu.domain.Match;
import com.gugugu.domain.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.client.ResourceAccessException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TeamMatch {

    private final static String idPattern = "\\d+$";
    public final static String filePath = "src/main/resources/player.txt";

    public List<String> getPlayersId(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        String line;
        ArrayList<String> playerList = new ArrayList<>();
        Pattern pattern = Pattern.compile(idPattern);
        while ((line = br.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String result = matcher.group();
                playerList.add(result);
            }
        }
        return playerList;
    }



    public Set<List<Object>> getPlayersTeamMatches(List<String> playersId, MatchesHistoryResult mhr) throws InterruptedException {
        List<List<Object>> playersTeamMatchList = new ArrayList<>();
        HistoryResult hr = null;
        int cnt = 1;
        for (String pid : playersId) {
            while (true) {
                try {
                    hr = mhr.pullMatchesHistory(pid, null);
                    break;
                } catch (ResourceAccessException | IOException e) {
                    System.out.println("连接超时准备重连中");
                }
            }
            playersTeamMatchList.addAll(getTeamMatch(playersId, hr));
            System.out.println(cnt++);
        }
        return new HashSet<>(playersTeamMatchList);
    }

    private List<List<Object>> getTeamMatch(List<String> playersId, HistoryResult hr) {
        List<Match> matches = hr.getHistoryResultQueryInfo().getMatches();
        List<List<Object>> playerTeamMatchList = new ArrayList<>();
        for (Match match : matches) {
            List<Player> players = match.getPlayers();
            int binaryPlayers = 0;
            for(Player player: players) {
                if (playersId.contains(String.valueOf(player.getAccountId()))) {
                    int i = playersId.indexOf(String.valueOf(player.getAccountId()));
                    binaryPlayers += 1 << i;
                }
            }
            if (Integer.bitCount(binaryPlayers) > 1) {
                List<Object> teamMatchId = new ArrayList<>();
                teamMatchId.add(match.getMatchId());
                teamMatchId.add(binaryPlayers);
                playerTeamMatchList.add(teamMatchId);
                System.out.println(teamMatchId);
            }
        }
        return playerTeamMatchList;
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        MatchesHistoryResult mhr = ctx.getBean(MatchesHistoryResult.class);
        TeamMatch tm = new TeamMatch();
        Set teamMatchSet = tm.getPlayersTeamMatches(tm.getPlayersId(filePath), mhr);
        System.out.println(teamMatchSet);
        CreateMapper sm = ctx.getBean(CreateMapper.class);
        for (Object match: teamMatchSet) {
            Match match1 = new Match();
            match1.setMatchId((Long) ((ArrayList<Object>) match).get(0));
            match1.setBinaryPlayers((Integer) ((ArrayList<Object>) match).get(1));
            sm.saveMatchId(match1);
        }
    }
}
