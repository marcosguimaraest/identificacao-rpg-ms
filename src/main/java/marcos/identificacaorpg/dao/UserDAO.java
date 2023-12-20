package marcos.identificacaorpg.dao;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDAO {
	private Long id;
	private String name;
	private String nickname;
	private String email;
	private String phoneNumber;
	private String profilePicture;
}