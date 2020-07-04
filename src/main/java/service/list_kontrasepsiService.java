package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import repository.list_kontrasepsiRepository;

@Service
@Transactional
public class list_kontrasepsiService {

	
	@Autowired
    private list_kontrasepsiRepository repo;
}
