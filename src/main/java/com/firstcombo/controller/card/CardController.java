package com.firstcombo.controller.card;

import com.firstcombo.card.client.domain.Result;
import com.firstcombo.card.client.domain.request.InsertCardReqDTO;
import com.firstcombo.card.client.interfaces.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CardController
 * @Description
 * @Author ftx
 * @Date 2021/8/30 15:06
 * @Version 1.0
 **/
@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/insertCard",method = RequestMethod.POST)
    public Result<Boolean> insertCard(InsertCardReqDTO insertCardReqDTO){
        return gameService.insertCard(insertCardReqDTO);
    }
}
