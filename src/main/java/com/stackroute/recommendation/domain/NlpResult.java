package com.stackroute.recommendation.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NlpResult {

    @Id
    private String id;
    private String intent;
    private String concept;
    private String sessonId;
}
