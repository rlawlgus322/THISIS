package com.web.curation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.web.curation.dao.DoctorDAO;
import com.web.curation.model.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorDAO doctordao;

	@Override
	public int insertDoctor(Doctor doctor) {
		return doctordao.insertDoctor(doctor);
	}

	@Override
	public int deleteDoctor(int user_id) {
		return doctordao.deleteDoctor(user_id);
	}

	@Override
	public int updateDoctor(int user_id) {
		return doctordao.updateDoctor(user_id);
	}

	@Override
	public List<Doctor> selectDoctor() {
		return doctordao.selectDoctor();
	}

	@Override
	public List<Doctor> selectCheckDoctor() {
		return doctordao.selectCheckDoctor();
	}

	@Override
	public Doctor selectDoctorByUserid(int user_id) {
		return doctordao.selectDoctorByUserid(user_id);
	}

	@Override
	public int updateDoctorImg(String img) {
		return doctordao.updateDoctorImg(img);
	}

	@Override
	public int updateDoctorAuth(int user_id) {
		return doctordao.updateDoctorAuth(user_id);
	}

	@Override
	public int updateDoctorAuthFail(int user_id) {
		return doctordao.updateDoctorAuthFail(user_id);
	}

}
