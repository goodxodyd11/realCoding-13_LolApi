package org.cnu.realcoding.lolapi.team13.lolapiteam13.controller;


import org.cnu.realcoding.lolapi.team13.lolapiteam13.api.SummonerMapApiClient;
import org.cnu.realcoding.lolapi.team13.lolapiteam13.domain.Summoner;
import org.cnu.realcoding.lolapi.team13.lolapiteam13.domain.SummonerId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class SummonerController {

    @Autowired
    SummonerMapApiClient summonerMapApiClient;

//    @GetMapping("/summoners/{name}")
//    public SummonerId getSummonerId(@PathVariable String name){
//       return summonerMapApiClient.getSummoner(name);
//    }

    @GetMapping("/summoners/encrypted/{encryptedName}")
    public Set<Summoner> getSummonerInfo(@PathVariable String encryptedName){
        //Set<Summoner> summnonerSet = new Set<Summoner>();
        return summonerMapApiClient.getSummonerInfo(encryptedName);
    }

}
