package org.cnu.realcoding.lolapi.team13.lolapiteam13.service;


import org.cnu.realcoding.lolapi.team13.lolapiteam13.api.SummonerMapApiClient;
import org.cnu.realcoding.lolapi.team13.lolapiteam13.repository.SummonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SummonerService {
    @Autowired
    private SummonerMapApiClient summonerMapApiClient;

    @Autowired
    private SummonerRepository summonerRepository;

    public void getSummonerInfo(){

    }

}
