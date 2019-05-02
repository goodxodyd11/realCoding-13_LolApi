package org.cnu.realcoding.lolapi.team13.lolapiteam13.domain;

import lombok.Data;

@Data
public class Summoner {
    private String queueType;
    private String summonerName;
    private boolean hotStreak;
    private MiniSeriesDTO miniSeries;
    private int wins;
    private boolean veteran;
    private int losses;
    private String rank;
    private String tier;
    private boolean inactive;
    private boolean freshBlood;
    private String leagueId;
    private String summonerId;
    private int leaguePoints;

    @Data
    public class MiniSeriesDTO {
        private int wins;
        private int losses;
        private int target;
        private String progress;

    }

}
