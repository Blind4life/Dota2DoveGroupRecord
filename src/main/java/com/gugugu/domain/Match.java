package com.gugugu.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Match {

    private long matchId;
    private long matchSeqNum;
    private long startTime;
    private int lobbyType;
    private List<Player> players;
    private boolean radiantWin;
    private int duration;
    private int towerStatusRadiant;
    private int towerStatusDire;
    private int gameMode;
    private int radianScore;
    private int direScore;
    private int binaryPlayers;

    public long getMatchSeqNum() {
        return matchSeqNum;
    }

    @JsonProperty("match_seq_num")
    public void setMatchSeqNum(long matchSeqNum) {
        this.matchSeqNum = matchSeqNum;
    }

    public long getStartTime() {
        return startTime;
    }

    @JsonProperty("start_time")
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getLobbyType() {
        return lobbyType;
    }

    @JsonProperty("lobby_type")
    public void setLobbyType(int lobbyType) {
        this.lobbyType = lobbyType;
    }

    public boolean isRadiantWin() {
        return radiantWin;
    }

    @JsonProperty("radiant_win")
    public void setRadiantWin(boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTowerStatusRadiant() {
        return towerStatusRadiant;
    }

    @JsonProperty("tower_status_radiant")
    public void setTowerStatusRadiant(int towerStatusRadiant) {
        this.towerStatusRadiant = towerStatusRadiant;
    }

    public int getTowerStatusDire() {
        return towerStatusDire;
    }

    @JsonProperty("tower_status_dire")
    public void setTowerStatusDire(int towerStatusDire) {
        this.towerStatusDire = towerStatusDire;
    }

    public int getGameMode() {
        return gameMode;
    }

    @JsonProperty("game_mode")
    public void setGameMode(int gameMode) {
        this.gameMode = gameMode;
    }

    public int getRadianScore() {
        return radianScore;
    }

    @JsonProperty("radiant_score")
    public void setRadianScore(int radianScore) {
        this.radianScore = radianScore;
    }

    public int getDireScore() {
        return direScore;
    }

    @JsonProperty("dire_score")
    public void setDireScore(int direScore) {
        this.direScore = direScore;
    }

    public long getMatchId() {
        return matchId;
    }

    @JsonProperty("match_id")
    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public List<Player> getPlayers() {
        return players;
    }

    @JsonProperty("players")
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getBinaryPlayers() {
        return binaryPlayers;
    }

    public void setBinaryPlayers(int binaryPlayers) {
        this.binaryPlayers = binaryPlayers;
    }

    @Override
    public String toString() {
        return "Match{" + "\n" +
                "matchId=" + matchId + "\n" +
                ", matchSeqNum=" + matchSeqNum + "\n" +
                ", startTime=" + startTime + "\n" +
                ", lobbyType=" + lobbyType + "\n" +
                ", players=" + players + "\n" +
                ", radiantWin=" + radiantWin + "\n" +
                ", duration=" + duration + "\n" +
                ", towerStatusRadiant=" + towerStatusRadiant + "\n" +
                ", towerStatusDire=" + towerStatusDire + "\n" +
                ", gameMode=" + gameMode + "\n" +
                ", radianScore=" + radianScore + "\n" +
                ", direScore=" + direScore + "\n" +
                '}';
    }
}
