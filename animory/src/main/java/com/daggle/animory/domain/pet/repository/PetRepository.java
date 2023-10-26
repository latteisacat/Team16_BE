package com.daggle.animory.domain.pet.repository;

import com.daggle.animory.domain.pet.entity.Pet;
import com.daggle.animory.domain.pet.entity.PetType;
import com.daggle.animory.domain.shelter.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PetRepository extends JpaRepository<Pet, Integer> {

    @Query("select p " +
        "from Pet p " +
        "join fetch p.shelter s " +
        "where s.address.province = :province " +
        "and p.type = :petType")
    Slice<Pet> findSliceBy(PetType petType, Province province, Pageable searchCondition);

    Slice<Pet> findSliceBy(Pageable pageable);

    Page<Pet> findPageBy(Pageable pageable);

    @Query("select p " +
        "from Pet p " +
        "where p.shelter.id = :shelterId")
    Page<Pet> findByShelterId(Integer shelterId, Pageable pageable);

    @Query(value = "SELECT p FROM Pet p"
            + " WHERE p.protectionExpirationDate IS NOT NULL"
            + " AND p.protectionExpirationDate >= CURRENT_DATE"
            + " ORDER BY p.protectionExpirationDate ASC")
    Page<Pet> findProfilesWithProtectionExpirationDate(Pageable pageable);

    @Query(value = "SELECT p FROM Pet p"
        + " ORDER BY p.createdAt DESC")
    Page<Pet> findProfilesWithCreatedAt(Pageable pageable);

    @Query(value = "SELECT p FROM Pet p"
        + " JOIN FETCH p.shelter"
        + " WHERE p.id = :petId")
    Optional<Pet> findById(Integer petId);
}
