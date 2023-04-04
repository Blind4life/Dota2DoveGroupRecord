package com.gugugu.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
    private long matchId;
    @JsonProperty("account_id")
    private long accountId;
    @JsonProperty("player_slot")
    private int playerSlot;
    @JsonProperty("team_number")
    private int teamNumber;
    @JsonProperty("team_slot")
    private int teamSlot;
    @JsonProperty("hero_id")
    private int heroId;
    @JsonProperty("item_0")
    private int item0;
    @JsonProperty("item_1")
    private int item1;
    @JsonProperty("item_2")
    private int item2;
    @JsonProperty("item_3")
    private int item3;
    @JsonProperty("item_4")
    private int item4;
    @JsonProperty("item_5")
    private int item5;
    @JsonProperty("item_neutral")
    private int itemNeutral;
    private int kills;
    private int deaths;
    private int assists;
    @JsonProperty("last_hits")
    private int lastHits;
    private int denies;
    @JsonProperty("gold_per_min")
    private int goldPerMin;
    @JsonProperty("xp_per_min")
    private int xpPerMin;
    private int level;
    @JsonProperty("hero_damage")
    private int heroDamage;
    @JsonProperty("tower_damage")
    private int towerDamage;

    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public int getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(int playerSlot) {
        this.playerSlot = playerSlot;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public int getTeamSlot() {
        return teamSlot;
    }

    public void setTeamSlot(int teamSlot) {
        this.teamSlot = teamSlot;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public int getItem0() {
        return item0;
    }

    public void setItem0(int item0) {
        this.item0 = item0;
    }

    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public int getItem2() {
        return item2;
    }

    public void setItem2(int item2) {
        this.item2 = item2;
    }

    public int getItem3() {
        return item3;
    }

    public void setItem3(int item3) {
        this.item3 = item3;
    }

    public int getItem4() {
        return item4;
    }

    public void setItem4(int item4) {
        this.item4 = item4;
    }

    public int getItem5() {
        return item5;
    }

    public void setItem5(int item5) {
        this.item5 = item5;
    }

    public int getItemNeutral() {
        return itemNeutral;
    }

    public void setItemNeutral(int itemNeutral) {
        this.itemNeutral = itemNeutral;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getLastHits() {
        return lastHits;
    }

    public void setLastHits(int lastHits) {
        this.lastHits = lastHits;
    }

    public int getDenies() {
        return denies;
    }

    public void setDenies(int denies) {
        this.denies = denies;
    }

    public int getGoldPerMin() {
        return goldPerMin;
    }

    public void setGoldPerMin(int goldPerMin) {
        this.goldPerMin = goldPerMin;
    }

    public int getXpPerMin() {
        return xpPerMin;
    }

    public void setXpPerMin(int xpPerMin) {
        this.xpPerMin = xpPerMin;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public int getTowerDamage() {
        return towerDamage;
    }

    public void setTowerDamage(int towerDamage) {
        this.towerDamage = towerDamage;
    }

    @Override
    public String toString() {
        return "Player{" + "\n" +
                "accountId=" + accountId + "\n" +
                ", playerSlot=" + playerSlot + "\n" +
                ", teamNumber=" + teamNumber + "\n" +
                ", teamSlot=" + teamSlot + "\n" +
                ", heroId=" + heroId + "\n" +
                ", item0=" + item0 + "\n" +
                ", item1=" + item1 + "\n" +
                ", item2=" + item2 + "\n" +
                ", item3=" + item3 + "\n" +
                ", item4=" + item4 + "\n" +
                ", item5=" + item5 + "\n" +
                ", itemNeutral=" + itemNeutral + "\n" +
                ", kills=" + kills + "\n" +
                ", deaths=" + deaths + "\n" +
                ", assists=" + assists + "\n" +
                ", lastHits=" + lastHits + "\n" +
                ", denies=" + denies + "\n" +
                ", goldPerMin=" + goldPerMin + "\n" +
                ", xpPerMin=" + xpPerMin + "\n" +
                ", level=" + level + "\n" +
                ", heroDamage=" + heroDamage + "\n" +
                ", towerDamage=" + towerDamage + "\n" +
                '}';
    }
}

