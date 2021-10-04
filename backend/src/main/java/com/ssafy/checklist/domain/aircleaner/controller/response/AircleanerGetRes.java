package com.ssafy.checklist.domain.aircleaner.controller.response;

import com.ssafy.checklist.domain.aircleaner.entity.Aircleaner;
import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AircleanerGetRes {
    @ApiModelProperty
    @NotNull
    Long pcode;

    @ApiModelProperty
    String name;

    @ApiModelProperty
    String brand;

    @ApiModelProperty
    Long price;

    @ApiModelProperty
    String img;

    @ApiModelProperty
    String type;      // 필터타입

    @ApiModelProperty
    String area;        // 청정면적

    @ApiModelProperty
    String dust;       // 먼지필터여부

    @ApiModelProperty
    String spec;        // 전체스펙

    public static AircleanerGetRes from(Aircleaner aircleaner) {
        return builder()
                .pcode(aircleaner.getPcode())
                .name(aircleaner.getName())
                .brand(aircleaner.getBrand())
                .price(aircleaner.getPrice())
                .img(aircleaner.getImg())
                .type(aircleaner.getType())
                .area(aircleaner.getArea())
                .dust(aircleaner.getDust())
                .spec(aircleaner.getSpec())
                .build();
    }
}