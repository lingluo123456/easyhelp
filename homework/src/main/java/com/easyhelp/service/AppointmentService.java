package com.easyhelp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.easyhelp.entity.Appointment;

public interface AppointmentService extends IService<Appointment> {
 Appointment getOne(Appointment appointment);
}
