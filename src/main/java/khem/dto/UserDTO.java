package khem.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import khem.Enum.Gender;
import lombok.Data;

@Data
public class UserDTO {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("username")
    private String username;
    @JsonProperty("Password")
    private String Password;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("DOB")
    private Date DOB;
    @JsonProperty("gender")
    private Gender gender;
    @JsonProperty("photo")
    private String photo;
    @JsonProperty("joinDate")
    private Date joinDate;
    @JsonProperty("active")
    private Boolean active;
}
