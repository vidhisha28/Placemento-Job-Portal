package com.placement.services;

import com.placement.daos.SettingsRepository;
import com.placement.entity.Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsService {

	@Autowired SettingsRepository repo;
	
	public void saveSettings(Settings ss) {
		repo.save(ss);
	}
	
	public Settings findSettings() {
		return repo.getById(1);
	}
	
}
