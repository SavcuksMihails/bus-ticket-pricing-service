package com.example.buspricing.dto;

import com.example.buspricing.model.Passenger;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DraftPriceRequest {
    private String route;
    private LocalDate date;
    private List<Passenger> passengers;
}
