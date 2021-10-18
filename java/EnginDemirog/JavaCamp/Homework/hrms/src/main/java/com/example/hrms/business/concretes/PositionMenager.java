package com.example.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrms.business.abstracts.PositionService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.PositionDao;
import com.example.hrms.entities.concretes.Position;

@Service
public class PositionMenager implements PositionService {
	private PositionDao positionDao;

	@Autowired
	public PositionMenager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public DataResult<List<Position>> getAll() {
		return new SuccessDataResult<List<Position>>(this.positionDao.findAll(), "Data Listelendi");

	}

	@Override
	public DataResult<List<Position>> findByPositionIs(String position) {
		return new SuccessDataResult<>(this.positionDao.findByJobPositionIs(position));

	}

	@Override
	public Result add(Position position) {
		if (this.findByPositionIs(position.getPositionName()).getData().size() != 0) {
			return new ErrorResult("Bu iş pozisyonu zaten mevcut");
		}

		this.positionDao.save(position);
		return new SuccessResult("Başarılı");
	}

}
