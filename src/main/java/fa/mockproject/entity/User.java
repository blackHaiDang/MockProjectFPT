package fa.mockproject.entity;

import fa.mockproject.model.RoleModel;
import fa.mockproject.model.UserModel;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "user_id", unique = true, nullable = false)
  private long userId;

  @NotEmpty(message = "First name should not empty.")
  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Email
  @NotEmpty(message = "Email should not empty.")
  @Column(name = "email", unique = true, nullable = false)
  private String email;

  @NotEmpty(message = "Password should not empty.")
  @Column(name = "password")
  private String password;

  @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
  @JoinTable(
      name = "users_roles",
      joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "user_id"),
      inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id",
          table = "roles")
  )
  private Set<Role> roles;

  public User() {
  }

  public User(String firstName, String email, String password, Set<Role> roles) {
    this.password = password;
    this.firstName = firstName;
    this.email = email;
    this.roles = roles;
  }

  public User(UserModel userModel) {
    this.userId = userModel.getUserId();
    this.password = userModel.getPassword();
    this.firstName = userModel.getFirstName();
    this.lastName = userModel.getLastName();
    this.phoneNumber = userModel.getPhoneNumber();
    this.email = userModel.getEmail();
    this.roles = mappingSetRole(userModel.getRoles());
  }

  public Set<Role> mappingSetRole(Set<RoleModel> roleModels) {
    Set<Role> roleMapping = new HashSet<>();
    for (RoleModel roleModel : roleModels) {
      roleMapping.add(new Role(roleModel));
    }
    return roleMapping;
  }

public long getUserId() {
	return userId;
}

public void setUserId(long userId) {
	this.userId = userId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Set<Role> getRoles() {
	return roles;
}

public void setRoles(Set<Role> roles) {
	this.roles = roles;
}
  
}