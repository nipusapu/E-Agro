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

        String intentName=req.getResult().getMetadata().getIntentName();

        if(intentName.equals("Crop_market")){
            String prameter=req.getResult().getStringParameter("month");
            if (prameter.matches("January.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Red Onion has higher market in january");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("February.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("it has no specific crop that has more market");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("March.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("it has no specific crop that has more market");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("April.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Green grams has higher market");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("May.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Green grams has higher market");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("June.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Green grams, Potato, tomato has higher market");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("July.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Green grams, Potato, tomato has higher market");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("August.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("potato has higher market");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("September.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("it has no specific crop that has more market");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("October.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("it has no specific crop that has more market");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("November.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("potato,Tomato has higher market");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("December.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("potato,Tomato has higher market");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            
        }


        return word ;
    }
}
