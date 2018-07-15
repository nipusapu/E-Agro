package com.susl.agroapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookRequest;
import com.google.api.services.dialogflow.v2.model.GoogleCloudDialogflowV2WebhookResponse;
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
        GoogleCloudDialogflowV2WebhookRequest req = jsoner.fromJson(result,GoogleCloudDialogflowV2WebhookRequest.class);

        String intentName=req.getQueryResult().getIntent().getDisplayName();

        if(intentName.equals("Crop_market")) {
            String prameter = req.getQueryResult().getParameters().get("month").toString();
            prameter = prameter.toLowerCase();
            if (prameter.matches("january.*")) {
                GoogleCloudDialogflowV2WebhookResponse res = new GoogleCloudDialogflowV2WebhookResponse();
                res.setSource("webhook");
                res.setFulfillmentText("correct");
                word = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(res);
            }
        }

        return word ;
    }
}
