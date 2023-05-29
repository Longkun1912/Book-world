package com.example.book.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

@Data
public class UserInfoDetails {
    @JsonProperty
    private UUID id;

    @JsonProperty
    private String username;

    @JsonProperty
    private String image_url;

    @JsonProperty
    private String email;

    @JsonProperty
    private String phone_number;

    @JsonProperty
    private String status;

    @JsonProperty
    private String last_updated;
}
