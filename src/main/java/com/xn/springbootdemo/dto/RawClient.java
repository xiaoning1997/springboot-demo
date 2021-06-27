package com.xn.springbootdemo.dto;

import lombok.*;

import java.time.LocalDateTime;

/**
 * @author ...
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RawClient {

    private String clientName;
    private String firstName;
    private String lastName;

    private LocalDateTime time;

}
