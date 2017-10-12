package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final MusicalInstrumentRepository musicalInstrumentRepository;

    @Autowired
    public DatabaseLoader(MusicalInstrumentRepository repository) {
        this.musicalInstrumentRepository = repository;
    }

	@Override
	public void run(String... strings) throws Exception {
		this.musicalInstrumentRepository.save(new MusicalInstrument("กลองชุด",500.0));
		this.musicalInstrumentRepository.save(new MusicalInstrument("กีตาร์ไฟฟ้า",300.0));
		this.musicalInstrumentRepository.save(new MusicalInstrument("กีตาร์โปร่ง",300.0));
		this.musicalInstrumentRepository.save(new MusicalInstrument("เบส",300.0));
		this.musicalInstrumentRepository.save(new MusicalInstrument("คีย์บอร์ด",450.0));
		
	}
}