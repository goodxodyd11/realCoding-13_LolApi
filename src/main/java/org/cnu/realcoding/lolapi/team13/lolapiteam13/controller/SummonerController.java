package org.cnu.realcoding.lolapi.team13.lolapiteam13.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummonerController {

    @GetMapping("/summoners")
    public void getSummonerId(@RequestBody String name){

    }

}
