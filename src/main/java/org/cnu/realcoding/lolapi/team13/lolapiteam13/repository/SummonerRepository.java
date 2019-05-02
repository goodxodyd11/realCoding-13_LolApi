package org.cnu.realcoding.lolapi.team13.lolapiteam13.repository;


import org.cnu.realcoding.lolapi.team13.lolapiteam13.domain.Summoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class SummonerRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertCurrentSummoner(Set<Summoner> summoner) {
        mongoTemplate.insertAll(summoner);

    }
}
