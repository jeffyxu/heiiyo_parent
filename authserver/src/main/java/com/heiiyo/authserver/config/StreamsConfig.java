package com.heiiyo.authserver.config;

import com.heiiyo.authserver.streams.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}
