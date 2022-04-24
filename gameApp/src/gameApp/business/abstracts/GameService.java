package gameApp.business.abstracts;

import gameApp.business.requests.creates.CreateGameRequest;
import gameApp.business.requests.deletes.DeleteCampaignRequest;
import gameApp.business.requests.deletes.DeleteGameRequest;
import gameApp.business.requests.updates.UpdateGameRequest;

public interface GameService {
	
	public void add(CreateGameRequest createGameRequest);
	public void delete(DeleteGameRequest deleteGameRequest);
	public void update(UpdateGameRequest updateGameRequest);

}
