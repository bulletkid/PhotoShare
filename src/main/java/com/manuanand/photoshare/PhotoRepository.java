package com.manuanand.photoshare;

import org.springframework.data.repository.CrudRepository;

import com.manuanand.photoshare.Photo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PhotoRepository extends CrudRepository<Photo, Integer> {

}
