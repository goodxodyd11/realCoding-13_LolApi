package org.cnu.realcoding.lolapi.team13.lolapiteam13.api;

import org.cnu.realcoding.lolapi.team13.lolapiteam13.domain.Summoner;
import org.cnu.realcoding.lolapi.team13.lolapiteam13.domain.SummonerId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@Service
public class SummonerMapApiClient {

    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl_id = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={apiKey}";
    private String requestUrl = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/{Summoner}?api_key={apiKey}";
   // private String url = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/DDulAaiCgJTtRQtuSkDFX0QqWmOOsthedhPTLJKTMpU10g?api_key=RGAPI-7557f57a-62bc-4564-98a5-6f69743a421e";
    private String apiKey = "RGAPI-7557f57a-62bc-4564-98a5-6f69743a421e";


    public SummonerId getSummoner(String SummonerIdString) {
       // SummonerId summonerId = restTemplate.exchange(requestUrl_id, HttpMethod.GET, null, SummonerId.class, SummonerIdString, apiKey)
        //        .getBody();
        //String id = summonerId.getId();
        return restTemplate.exchange(requestUrl_id, HttpMethod.GET, null, SummonerId.class, SummonerIdString, apiKey).getBody();
    }
    public Set<Summoner> getSummonerInfo(String SummonerIdString){
      // Set<Summoner> summnonerSet = restTemplate.exchange(requestUrl, HttpMethod.GET, null, Set.class, encryptedSummonerId, apiKey).getBody();
        String encryptedSummonerId = restTemplate.exchange(requestUrl_id, HttpMethod.GET, null, SummonerId.class, SummonerIdString, apiKey).getBody().getId();
        return restTemplate.exchange(requestUrl, HttpMethod.GET, null, Set.class, encryptedSummonerId, apiKey).getBody();
    }

}
