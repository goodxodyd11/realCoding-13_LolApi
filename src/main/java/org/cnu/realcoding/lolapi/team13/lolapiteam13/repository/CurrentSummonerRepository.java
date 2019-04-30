package org.cnu.realcoding.lolapi.team13.lolapiteam13.repository;


import org.cnu.realcoding.lolapi.team13.lolapiteam13.domain.Summoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CurrentSummonerRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertCurrentSummoner(Summoner summoner) {
        mongoTemplate.insert(summoner);

    }
}
