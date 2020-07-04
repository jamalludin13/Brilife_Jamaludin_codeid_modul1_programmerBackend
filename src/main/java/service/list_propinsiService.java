package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import repository.list_propinsiRepository;
@Service
@Transactional

public class list_propinsiService {

	
	@Autowired
    private list_propinsiRepository repo;
}
