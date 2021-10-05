package com.ssafy.checklist.domain.monitor.controller.response;

import com.ssafy.checklist.domain.common.entity.LowPriceInfo;
import com.ssafy.checklist.domain.monitor.entity.Monitor;
import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
public class MonitorGetRes {

    @ApiModelProperty
    @NotNull
    long pcode;

    @ApiModelProperty
    @NotNull
    String name;

    @ApiModelProperty
    String brand;

    @ApiModelProperty
    long price;

    @ApiModelProperty
    String img;

    @ApiModelProperty
    String size;

    @ApiModelProperty
    String pixel;

    @ApiModelProperty
    int hz;

    @ApiModelProperty
    String spec;

    List<LowPriceInfo> lowPriceInfos;

    public static MonitorGetRes of(Monitor monitor, List<LowPriceInfo> list) {
        MonitorGetRes monitorGetRes = new MonitorGetRes();
        monitorGetRes.setPcode(monitor.getPcode());
        monitorGetRes.setName(monitor.getName());
        monitorGetRes.setBrand(monitor.getBrand());
        monitorGetRes.setPrice(monitor.getPrice());
        monitorGetRes.setImg(monitor.getImg());
        monitorGetRes.setSize(monitor.getSize());
        monitorGetRes.setPixel(monitor.getPixel());
        monitorGetRes.setHz(monitor.getHz());
        monitorGetRes.setSpec(monitor.getSpec());
        monitorGetRes.setLowPriceInfos(list);

        return monitorGetRes;
    }
}