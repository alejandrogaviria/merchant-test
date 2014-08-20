package com.mozido.channels.nextweb.model;

import java.util.List;

import com.mozido.api.core.personshared.PersonRoles;

/**
 * User Container
 *
 * @Author Alex Manusovich
 */
public class UserDTO extends BaseDTO {
    private SessionDTO session;
    private String id;
    private String firstName;
    private String lastName;
    private String tenantName;
    private String personType;
    private String timezone;
    private String timezoneOffset;
    

	protected List<String> roles;
    protected List<String> companyUsers;

    public UserDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SessionDTO getSession() {
        return session;
    }

    public void setSession(final SessionDTO session) {
        this.session = session;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getFullNameString() {
        return getFirstName() + " " + getLastName();
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<String> getCompanyUsers() {
		return companyUsers;
	}

	public void setCompanyUsers(List<String> companyUsers) {
		this.companyUsers = companyUsers;
	}

    @Override
	public String toString() {
		return "UserDTO [session=" + session + ", id=" + id + ", firstName="
				+ firstName + ", lastName=" + lastName + ", tenantName="
				+ tenantName + ", personType=" + personType + ", timezone="
				+ timezone + ", timezoneOffset=" + timezoneOffset + ", roles="
				+ roles + ", companyUsers=" + companyUsers + "]";
	}

	
}
