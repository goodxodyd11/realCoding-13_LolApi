package org.cnu.realcoding.lolapi.team13.lolapiteam13.api;

import org.cnu.realcoding.lolapi.team13.lolapiteam13.domain.SummonerId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SummonerMapApiClient {

    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl_id = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={apiKey}";
    private String requestUrl = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/{Summoner}?api_key={apiKey}";
    private String apiKey = "RGAPI-acfc55d4-5656-4d23-bf5f-e77a2111d812";


    public SummonerId getSummoner(String SummonerIdString) {
       // SummonerId summonerId = restTemplate.exchange(requestUrl_id, HttpMethod.GET, null, SummonerId.class, SummonerIdString, apiKey)
        //        .getBody();
        //String id = summonerId.getId();
        return restTemplate.exchange(requestUrl_id, HttpMethod.GET, null, SummonerId.class, SummonerIdString, apiKey).getBody();
    }

}
