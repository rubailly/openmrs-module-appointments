package org.openmrs.module.appointments.web.contract;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Time;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentServicePayload {

    private Integer appointmentServiceId;

    @Size(min = 1)
    private String name;
    private String specialityUuid;
    private Time startTime;
    private Time endTime;
    private Integer maxAppointmentsLimit;
    private Integer durationMins;
    private String locationUuid;
    private String uuid;

    public Integer getAppointmentServiceId() {
        return appointmentServiceId;
    }

    public void setAppointmentServiceId(Integer appointmentServiceId) {
        this.appointmentServiceId = appointmentServiceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialityUuid() {
        return specialityUuid;
    }

    public void setSpecialityUuid(String specialityUuid) {
        this.specialityUuid = specialityUuid;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Integer getMaxAppointmentsLimit() {
        return maxAppointmentsLimit;
    }

    public void setMaxAppointmentsLimit(Integer maxAppointmentsLimit) {
        this.maxAppointmentsLimit = maxAppointmentsLimit;
    }

    public Integer getDurationMins() {
        return durationMins;
    }

    public void setDurationMins(Integer durationMins) {
        this.durationMins = durationMins;
    }

    public String getLocationUuid() {
        return locationUuid;
    }

    public void setLocationUuid(String locationUuid) {
        this.locationUuid = locationUuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
