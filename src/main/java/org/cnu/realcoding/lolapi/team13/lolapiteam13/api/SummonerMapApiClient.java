package org.cnu.realcoding.lolapi.team13.lolapiteam13.api;

import org.cnu.realcoding.lolapi.team13.lolapiteam13.domain.Summoner;
import org.cnu.realcoding.lolapi.team13.lolapiteam13.domain.SummonerId;
import org.cnu.realcoding.lolapi.team13.lolapiteam13.repository.SummonerRepository;
import org.cnu.realcoding.lolapi.team13.lolapiteam13.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@Service
public class SummonerMapApiClient {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SummonerRepository summonerRepository;

    private String requestUrl_id = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={apiKey}";
    private String requestUrl = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/{Summoner}?api_key={apiKey}";
    private String apiKey = "RGAPI-7557f57a-62bc-4564-98a5-6f69743a421e";


    public Set<Summoner> getSummonerInfo(String SummonerIdString){

        String encryptedSummonerId = restTemplate.exchange(requestUrl_id, HttpMethod.GET, null, SummonerId.class, SummonerIdString, apiKey).getBody().getId();
        Set<Summoner> getSummonerSet = restTemplate.exchange(requestUrl, HttpMethod.GET, null, Set.class, encryptedSummonerId, apiKey).getBody();
        summonerRepository.insertCurrentSummoner(getSummonerSet);
        return getSummonerSet;
    }

}
