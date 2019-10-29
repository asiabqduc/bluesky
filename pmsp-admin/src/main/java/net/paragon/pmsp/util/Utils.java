package net.paragon.pmsp.util;

import java.util.List;

import javax.faces.application.FacesMessage;

import net.paragon.pmsp.domain.model.Car;

public interface Utils {
    List<Car> getCars();
    void init();

    void addDetailMessage(String message);

    void addDetailMessage(String message, FacesMessage.Severity severity);

    boolean isUserInRole(String role);
}
