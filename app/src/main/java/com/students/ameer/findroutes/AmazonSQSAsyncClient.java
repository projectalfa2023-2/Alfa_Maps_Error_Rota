package com.students.ameer.findroutes;

import java.text.Collator;

public class AmazonSQSAsyncClient {
    private String region;

    public AmazonSQSAsyncClient(Collator instance) {

    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void sendMessageAsync(SendMessageRequest req, AsyncHandler<SendMessageRequest,SendMessageResult> sendMessageRequestSendMessageResultAsyncHandler) {
    }
}
