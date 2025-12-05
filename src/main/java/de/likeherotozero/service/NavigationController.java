package de.likeherotozero.service;

import java.io.Serializable;

import de.likeherotozero.beans.BenutzerBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("navigation")
@SessionScoped
public class NavigationController implements Serializable {
	@Inject
    private BenutzerBean benutzerBean;
	public String ladeEdit() {
		if (benutzerBean.isEingeloggt() && benutzerBean.isAdmin()) {
			return "edit";
		}
		return "start";
	}
	public String ladeStart() {
		return "start";
	}
	public String ladeHome() {
		if (benutzerBean.isEingeloggt()) {
			return "home";
		}
		return "start";
	}
	public String ladeError() {
		return "login";
	}
}