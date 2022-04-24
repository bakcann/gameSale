package gameApp.business.abstracts;

import gameApp.business.requests.creates.CreateUserRequest;
import gameApp.business.requests.deletes.DeleteUserRequest;
import gameApp.business.requests.updates.UpdateUserRequest;

public interface UserService {
	
	public void add(CreateUserRequest createUserRequest);
	public void delete(DeleteUserRequest deleteUserRequest);
	public void update(UpdateUserRequest updateUserRequest);

}
