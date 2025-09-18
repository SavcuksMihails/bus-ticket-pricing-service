package com.example.buspricing.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Passenger {
    public enum Type { ADULT, CHILD }

    private Type type;
    private int luggageCount;
}
