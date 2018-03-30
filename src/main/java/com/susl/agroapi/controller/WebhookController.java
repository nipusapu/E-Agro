package com.susl.agroapi.controller;

import ai.api.model.AIResponse;
import ai.api.model.Fulfillment;
import ai.api.model.ResponseMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kniip on 3/3/2018.
 */
@RestController
@RequestMapping("/webhook")
public class WebhookController {
    @RequestMapping(method = RequestMethod.POST,value = "text")
    public String textwebhook(@RequestBody String result ) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String word="";

        Gson jsoner = ai.api.GsonFactory.getDefaultFactory().getGson();
        AIResponse req = jsoner.fromJson(result, AIResponse.class);
        String test=req.getResult().getResolvedQuery();

        if (test.equals("what is my city?")){
            Fulfillment res = new Fulfillment();
            res.setSource("webhook");
            ResponseMessage.ResponseSpeech mes=new ResponseMessage.ResponseSpeech();
            mes.setSpeech("beruwala");
            res.setMessages(mes);
            word=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);;
        }
        return word ;
    }
}
