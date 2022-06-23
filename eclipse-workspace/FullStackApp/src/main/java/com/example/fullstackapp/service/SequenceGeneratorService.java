package com.example.fullstackapp.service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.example.fullstackapp.model.DatabaseSequence;

@Service
public class SequenceGeneratorService {

	private  MongoOperations mongoOperations;
	
	// definido o constructor - com injeção de dependencia
	@Autowired
	public SequenceGeneratorService(MongoOperations mongoOperations) {
		this.mongoOperations = mongoOperations;
	}
	
	// criando um método para gerar uma sequencia para inserção de dados
	public long generateSequence(String seqName) {
		DatabaseSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
				new Update().inc("seq", 1), options().returnNew(true).upsert(true), DatabaseSequence.class);
		
		//expressão de retorno
		return !Objects.isNull(counter) ? counter.getSeq(): 1;
	}

}
