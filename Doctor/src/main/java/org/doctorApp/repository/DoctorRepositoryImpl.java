package org.doctorApp.repository;

import org.doctorApp.model.Doctor;
import org.doctorApp.util.DoctorDb;
import org.doctorApp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void addDoctor(Doctor doctor) {
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
        ) {
            statement.setString(1, doctor.getDoctorName());
            statement.setString(2, doctor.getSpeciality());
            statement.setInt(3, doctor.getExperience());
            statement.setInt(4, doctor.getRatings());
            statement.setDouble(5, doctor.getFees());
            Boolean result = statement.execute();
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);) {
            statement.setInt(2, doctorId);
            statement.setDouble(1, fees);
            Boolean result = statement.execute();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDoctor(int doctorId) {
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);) {
            statement.setInt(1, doctorId);
            Boolean result = statement.execute();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Doctor findById(int doctorId) {
        return null;
    }

    @Override
    public List<Doctor> findAll() {
        List<Doctor> doctors = new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);
             ResultSet set = statement.executeQuery();
        ) {
            while (set.next()) {

                int doctorId = set.getInt("doctor_Id");
                String docterName = set.getString("doctor_name");
                String speciality = set.getString("speciality");
                int experience = set.getInt("experience");
                int ratings = set.getInt("ratings");
                double fees = set.getDouble("fees");
                Doctor doctor = new Doctor(doctorId, docterName, speciality, fees, ratings, experience);
                doctors.add(doctor);
            }
            return doctors;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Doctor> findBySpeciality(String speciality) {
        List<Doctor> doctors = new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITY);) {

            statement.setString(1, speciality);

            try (ResultSet set = statement.executeQuery();
            ) {
                while (set.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorId(set.getInt("doctor_Id"));
                    doctor.setDoctorName(set.getString("doctor_name"));
                    doctor.setSpeciality(set.getString("speciality"));
                    doctor.setExperience(set.getInt("experience"));
                    doctor.setRatings(set.getInt("ratings"));
                    doctor.setFees(set.getDouble("fees"));
                    doctors.add(doctor);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctors;
    }

    @Override
    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
        List<Doctor> doctors = new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITYANDEXP);) {

            statement.setString(1, speciality);
            statement.setInt(2, experience);

            try (ResultSet set = statement.executeQuery();
            ) {
                while (set.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorId(set.getInt("doctor_Id"));
                    doctor.setDoctorName(set.getString("doctor_name"));
                    doctor.setSpeciality(set.getString("speciality"));
                    doctor.setExperience(set.getInt("experience"));
                    doctor.setRatings(set.getInt("ratings"));
                    doctor.setFees(set.getDouble("fees"));
                    doctors.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctors;
    }

        @Override
        public List<Doctor> findBySpecialityAndLessFees (String speciality,double fees){
            List<Doctor> doctors = new ArrayList<>();
            try (Connection connection = DoctorDb.openConnection();
                 PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITYANDFEES);) {

                statement.setString(1, speciality);
                statement.setDouble(2, fees);

                try (ResultSet set = statement.executeQuery();
                ) {
                    while (set.next()) {
                        Doctor doctor = new Doctor();
                        doctor.setDoctorId(set.getInt("doctor_Id"));
                        doctor.setDoctorName(set.getString("doctor_name"));
                        doctor.setSpeciality(set.getString("speciality"));
                        doctor.setExperience(set.getInt("experience"));
                        doctor.setRatings(set.getInt("ratings"));
                        doctor.setFees(set.getDouble("fees"));
                        doctors.add(doctor);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return doctors;
        }

        @Override
        public List<Doctor> findBySpecialityAndRatings (String speciality,int ratings){
          List<Doctor> doctors=new ArrayList<>();
          try(Connection connection=DoctorDb.openConnection();
          PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECIALITYANDRATINGS);){
              statement.setString(1,speciality);
              statement.setInt(2,ratings);
              try(ResultSet set=statement.executeQuery()){
                  while (set.next()){
                      Doctor doctor=new Doctor();
                      doctor.setDoctorId(set.getInt("doctor_Id"));
                      doctor.setDoctorName(set.getString("doctor_name"));
                      doctor.setSpeciality(set.getString("speciality"));
                      doctor.setExperience(set.getInt("experience"));
                      doctor.setRatings(set.getInt("ratings"));
                      doctor.setFees(set.getDouble("fees"));
                      doctors.add(doctor);
                  }

              }
          }catch (Exception e){
              e.printStackTrace();
          }
          return doctors;
        }

        @Override
        public List<Doctor> findBySpecialityAndNameContains (String speciality, String doctorName){
            List<Doctor> doctors=new ArrayList<>();
            try(Connection connection=DoctorDb.openConnection();
                PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECIALITYANDNAME);){
                statement.setString(1,speciality);
                statement.setString(2,doctorName);
                try(ResultSet set=statement.executeQuery()){
                    while (set.next()){
                        Doctor doctor=new Doctor();
                        doctor.setDoctorId(set.getInt("doctor_Id"));
                        doctor.setDoctorName(set.getString("doctor_name"));
                        doctor.setSpeciality(set.getString("speciality"));
                        doctor.setExperience(set.getInt("experience"));
                        doctor.setRatings(set.getInt("ratings"));
                        doctor.setFees(set.getDouble("fees"));
                        doctors.add(doctor);
                    }

                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return doctors;
        }
    }
