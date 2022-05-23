package com.example.parkingspot.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ParkingSpotDTO {

    @NotBlank
    private String parkingSpotNumber;
    @NotBlank
    @Size(max=7)
    private String vehiclePlate;
    @NotBlank
    private String vehicleBrand;
    @NotBlank
    private String vehicleModel;
    @NotBlank
    private String vehicleColor;
    @NotBlank
    private String responsibleName;
    @NotBlank
    private String apartment;
    @NotBlank
    private String block;

}
