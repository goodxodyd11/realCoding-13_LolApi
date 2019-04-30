package org.cnu.realcoding.lolapi.team13.lolapiteam13.controller;


import org.cnu.realcoding.lolapi.team13.lolapiteam13.api.SummonerMapApiClient;
import org.cnu.realcoding.lolapi.team13.lolapiteam13.domain.SummonerId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummonerController {

    @Autowired
    SummonerMapApiClient summonerMapApiClient;

    @GetMapping("/summoners/{name}")
    public SummonerId getSummonerId(@PathVariable String name){
       return summonerMapApiClient.getSummoner(name);
    }

}
