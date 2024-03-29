package com.codecool.SpeedControlAPI.dto.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class StatusResponse {

    private Integer code;
    private String message;
}
