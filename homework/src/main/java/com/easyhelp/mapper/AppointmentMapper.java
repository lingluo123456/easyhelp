package com.easyhelp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.easyhelp.entity.Appointment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppointmentMapper extends BaseMapper<Appointment> {
}
