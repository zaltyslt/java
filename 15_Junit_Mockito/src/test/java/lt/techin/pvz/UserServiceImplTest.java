package lt.techin.pvz;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

	@InjectMocks
	UserServiceImpl service;

	@Mock
	UserRepository repo;

	@Test
	void testCreateUser() {

		Mockito.when(repo.save(Mockito.any(User.class)))
				.thenReturn(true);

		assertNotNull(service.createUser("Jonas"));
	}

	@Test
	void testCreateUserException() {

		Mockito.when(repo.save(Mockito.any(User.class))).thenReturn(false);

		assertThrows(UserServiceException.class, () -> service.createUser("dddd"));
	}

}
