package com.heiiyo.authserver.streams;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface GreetingsStreams {

    @Output(OutPutStreams.ELK_OUTPUT)
    MessageChannel outboundGreetings();
}