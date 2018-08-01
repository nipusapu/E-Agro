package com.susl.agroapi.controller;

import ai.api.model.AIOutputContext;
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

import java.util.List;

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
        AIResponse req = jsoner.fromJson(result,AIResponse.class);

        String intentName=req.getResult().getMetadata().getIntentName();

        if(intentName.equals("Crop_market")){
            String prameter=req.getResult().getStringParameter("month");
            prameter=prameter.toLowerCase();
            if (prameter.matches("january.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("it has no specific crop that has more market");
                res.setMessages(mes);
                res.setSpeech("it has no specific crop that has more market");
                res.setDisplayText("it has no specific crop that has more market");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("february.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("it has no specific crop that has more market");
                res.setSpeech("it has no specific crop that has more market");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("march.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("it has no specific crop that has more market");
                res.setMessages(mes);
                res.setSpeech("it has no specific crop that has more market");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("april.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Green grams has higher market");
                res.setMessages(mes);
                res.setSpeech("Green grams has higher market");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("may.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Green grams has higher market");
                res.setMessages(mes);
                res.setSpeech("Green grams has higher market");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("june.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Green grams, Potato, tomato has higher market");
                res.setMessages(mes);
                res.setSpeech("Green grams, Potato, tomato has higher market");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("july.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Green grams, Potato, tomato has higher market");
                res.setMessages(mes);
                res.setSpeech("Green grams, Potato, tomato has higher market");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("august.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("potato has higher market");
                res.setMessages(mes);
                res.setSpeech("potato has higher market");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("september.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("it has no specific crop that has more market");
                res.setMessages(mes);
                res.setSpeech("it has no specific crop that has more market");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("october.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("it has no specific crop that has more market");
                res.setMessages(mes);
                res.setSpeech("it has no specific crop that has more market");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("november.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("potato,Tomato has higher market");
                res.setMessages(mes);
                res.setSpeech("potato,Tomato has higher market");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("december.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("potato,Tomato has higher market");
                res.setMessages(mes);
                res.setSpeech("potato,Tomato has higher market");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }

        }

        if(intentName.equals("Location_user")) {
            String prameter = req.getResult().getStringParameter("location");
            prameter = prameter.toLowerCase();
            if (prameter.matches("monaragala.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("You can grow Tomato, Maize, paddy");
                res.setMessages(mes);
                res.setSpeech("You can grow Tomato, Maize, paddy");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("badulla.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("You can grow Potato, tomato, green grams, paddy");
                res.setMessages(mes);
                res.setSpeech("You can grow Potato, tomato, green grams, paddy");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("walimada.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Red onion, beet-root, carrot, tomato are suitable to grow");
                res.setMessages(mes);
                res.setSpeech("Red onion, beet-root, carrot, tomato are suitable to grow");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
        }
        if(intentName.equals("Crop_growing_soil")) {
            String prameter = req.getResult().getStringParameter("location");
            prameter = prameter.toLowerCase();
            if (prameter.matches("monaragala.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("this area contain soil that contain L1 moisture. Do you need more details?");
                res.setMessages(mes);
                res.setSpeech("this area contain soil that contain L1 moisture. Do you need more details?");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("badulla.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("this area contain soil that containL1 moisture and L3 Moisture.Do you need more details?");
                res.setMessages(mes);
                res.setSpeech("this area contain soil that containL1 moisture and L3 Moisture.Do you need more details?");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("walimada.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("this area contain soil that contain L2 Moisture.Do you need more details?");
                res.setMessages(mes);
                res.setSpeech("this area contain soil that contain L2 Moisture.Do you need more details?");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
        }

        if(intentName.equals("Crop_growing_soil-yes")) {
            List<AIOutputContext> contexts = req.getResult().getContexts();
            for(AIOutputContext item:contexts){
                if(item.getName().matches("crop_growing_soil-followup")) {
                   String location= item.getParameters().get("location").isJsonNull() ? "" : item.getParameters().get("location").getAsString();
                    location=location.toLowerCase();
                    if(location.matches("badulla.*")) {
                        Fulfillment res = new Fulfillment();
                        res.setSource("webhook");
                        ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                        mes.setSpeech("You can grow Potato, tomato, green grams, paddy");
                        res.setMessages(mes);
                        res.setSpeech("You can grow Potato, tomato, green grams, paddy");
                        word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
                    }
                    if(location.matches("monaragala.*")) {
                        Fulfillment res = new Fulfillment();
                        res.setSource("webhook");
                        ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                        mes.setSpeech("You can grow Tomato, Maize, paddy");
                        res.setMessages(mes);
                        res.setSpeech("You can grow Tomato, Maize, paddy");
                        word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
                    }
                    if(location.matches("walimada.*")) {
                        Fulfillment res = new Fulfillment();
                        res.setSource("webhook");
                        ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                        mes.setSpeech("Red onion, beet-root, carrot, tomato are suitable to grow");
                        res.setMessages(mes);
                        res.setSpeech("Red onion, beet-root, carrot, tomato are suitable to grow");
                        word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
                    }
                }
            }

        }
        if(intentName.equals("Crop_growing_weather")) {
            String prameter = req.getResult().getStringParameter("crop");
            prameter = prameter.toLowerCase();
            if (prameter.matches("tomato.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("It need more wet weather");
                res.setMessages(mes);
                res.setSpeech("It need more wet weather");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("potato.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("it need more sunny weather");
                res.setMessages(mes);
                res.setSpeech("it need more sunny weather");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("green grams.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("It need a dry weather");
                res.setMessages(mes);
                res.setSpeech("It need a dry weather");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("paddy.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("It need a wet weather");
                res.setMessages(mes);
                res.setSpeech("It need a wet weather");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("beet root.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("It nead a wet weather");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("It need a wet weather");
                res.setMessages(mes);
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }

        }
        if(intentName.equals("Crops_growing_areas")) {
            String prameter = req.getResult().getStringParameter("crop");
            prameter = prameter.toLowerCase();

            if (prameter.matches("tomato.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Welimada, Badulla are good");
                res.setMessages(mes);
                res.setSpeech("Welimada, Badulla are good");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("potato.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Moneragala,welimada are good");
                res.setMessages(mes);
                res.setSpeech("Moneragala,welimada are good");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("green grams.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Moneragala is good");
                res.setMessages(mes);
                res.setSpeech("It need a dry weather");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("paddy.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Welimada,moneragala are good");
                res.setMessages(mes);
                res.setSpeech("Welimada,moneragala are good");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("beet root.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("Welmada, Badulla are good");
                res.setMessages(mes);
                res.setSpeech("Welmada, Badulla are good");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }

        }

        if(intentName.equals("Time_crop_grow")) {
            String prameter = req.getResult().getStringParameter("crop");
            prameter = prameter.toLowerCase();

            if (prameter.matches("tomato.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("January to April & October to november is good");
                res.setMessages(mes);
                res.setSpeech("January to April & October to november is good");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("potato.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("March to June is good");
                res.setMessages(mes);
                res.setSpeech("March to June is good");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("green grams.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("December to April is good");
                res.setMessages(mes);
                res.setSpeech("December to April is good");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("paddy.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("webhook");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("January to April & June to October is good");
                res.setMessages(mes);
                res.setSpeech("January to April & June to October is good");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
            if (prameter.matches("beet root.*")) {
                Fulfillment res = new Fulfillment();
                res.setSource("It nead a wet weather");
                ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                mes.setSpeech("February to April is good");
                res.setMessages(mes);
                res.setSpeech("February to April is good");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }


        }
        if(intentName.equals("Crops_type - location")) {
            String prameter = req.getResult().getStringParameter("location");
            prameter = prameter.toLowerCase();
            List<AIOutputContext> contexts = req.getResult().getContexts();
            for(AIOutputContext item:contexts){
                if(item.getName().matches("crop_growing_soil-followup")) {
                    String crop= item.getParameters().get("crop").isJsonNull() ? "" : item.getParameters().get("crop").getAsString();
                    crop=crop.toLowerCase();
                    if (prameter.matches("badulla.*")) {

                        if (crop.matches("paddy.*")) {
                            Fulfillment res = new Fulfillment();
                            res.setSource("webhook");
                            ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                            mes.setSpeech("Sudu Samba, Rathu samba can be grown");
                            res.setMessages(mes);
                            res.setSpeech("Sudu Samba, Rathu samba can be grown");
                            word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
                        }
                        if (crop.matches("vegitable.*")) {
                            Fulfillment res = new Fulfillment();
                            res.setSource("webhook");
                            ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                            mes.setSpeech("Tomato, potato, beet root can be grown");
                            res.setMessages(mes);
                            res.setSpeech("Tomato, potato, beet root can be grown");
                            word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
                        }
                        if (crop.matches("cereal.*")) {
                            Fulfillment res = new Fulfillment();
                            res.setSource("webhook");
                            ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                            mes.setSpeech("Green grams can be grown");
                            res.setMessages(mes);
                            res.setSpeech("Green grams can be grown");
                            word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
                        }
                    }
                    if (prameter.matches("monaragala.*")) {

                        if (crop.matches("paddy.*")) {
                            Fulfillment res = new Fulfillment();
                            res.setSource("webhook");
                            ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                            mes.setSpeech("Rathu kekulu, Ma wee,Sudu Samba can be grown");
                            res.setMessages(mes);
                            res.setSpeech("Rathu kekulu, Ma wee,Sudu Samba can be grown");
                            word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
                        }
                        if (crop.matches("vegitable.*")) {
                            Fulfillment res = new Fulfillment();
                            res.setSource("webhook");
                            ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                            mes.setSpeech("Red onion can be grown");
                            res.setMessages(mes);
                            res.setSpeech("Red onion can be grown");
                            word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
                        }
                        if (crop.matches("cereal.*")) {
                            Fulfillment res = new Fulfillment();
                            res.setSource("webhook");
                            ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                            mes.setSpeech("Maize can be grown");
                            res.setMessages(mes);
                            res.setSpeech("Maize can be grown");
                            word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
                        }
                    }
                    if (prameter.matches("walimada.*")) {

                        if (crop.matches("paddy.*")) {
                            Fulfillment res = new Fulfillment();
                            res.setSource("Sudu samba can be grown");
                            ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                            mes.setSpeech("L1 soil type");
                            res.setMessages(mes);
                            res.setSpeech("Sudu samba can be grown");
                            word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
                        }
                        if (crop.matches("vegitable.*")) {
                            Fulfillment res = new Fulfillment();
                            res.setSource("webhook");
                            ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                            mes.setSpeech("Tomato, potato, beet root can be grown");
                            res.setMessages(mes);
                            res.setSpeech("Tomato, potato, beet root can be grown");
                            word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
                        }
                        if (crop.matches("cereal.*")) {
                            Fulfillment res = new Fulfillment();
                            res.setSource("webhook");
                            ResponseMessage.ResponseSpeech mes = new ResponseMessage.ResponseSpeech();
                            mes.setSpeech("Green grams can be grown");
                            res.setMessages(mes);
                            res.setSpeech("Green grams can be grown");
                            word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
                        }
                    }
                }
            }

        }


        return word ;
    }
}
