package com.daggle.animory.testutil.fixture;

import com.daggle.animory.domain.pet.entity.*;
import com.daggle.animory.domain.shelter.entity.Shelter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PetFixture {

    public static Pet getOne(final Shelter shelter) {
        return Pet.builder()
            .name("멍멍이")
            .birthDate(LocalDate.now().minusMonths(6))
            .type(PetType.DOG)
            .weight(5.0f)
            .description("멍멍이는 귀여워요")
            .sex(Sex.MALE)
            .protectionExpirationDate(LocalDate.now().plusMonths(6))
            .vaccinationStatus("접종완료")
            .neutralizationStatus(NeutralizationStatus.UNKNOWN)
            .adoptionStatus(AdoptionStatus.NO)
            .profileImageUrl("http://amazon.server/api/petImage/20231001104521_test1.jpg")
            .profileShortFormUrl("http://amazon.server/api/petVideo/20231001104521_test1.mp4")
            .size("작아요 소형견입니다.")
            .petPolygonProfile(
                PetPolygonProfile.builder()
                    .activeness(3)
                    .intelligence(3)
                    .affinity(2)
                    .adaptability(4)
                    .athletic(1)
                    .build()
            )
            .shelter(shelter)
            .build();
    }

    public static List<Pet> get(final int n,
                                final PetType petType,
                                final Shelter shelter) {
        final List<Pet> pets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pets.add(
                Pet.builder()
                    .name("멍멍이" + i)
                    .birthDate(LocalDate.now().minusMonths(6))
                    .type(PetType.DOG)
                    .weight(5.0f)
                    .description("멍멍이는 귀여워요" + i)
                    .sex(Sex.MALE)
                    .protectionExpirationDate(LocalDate.now().plusMonths(1))
                    .vaccinationStatus("접종완료" + i)
                    .neutralizationStatus(NeutralizationStatus.UNKNOWN)
                    .adoptionStatus(AdoptionStatus.NO)
                    .profileImageUrl("http://amazon.server/api/petImage/20231001104521_test" + i + ".jpg")
                    .profileShortFormUrl("http://amazon.server/api/petVideo/20231001104521_test" + i + ".mp4")
                    .size("작아요 소형견입니다." + i)
                    .petPolygonProfile(
                        PetPolygonProfile.builder()
                            .activeness(3)
                            .intelligence(3)
                            .affinity(2)
                            .adaptability(4)
                            .athletic(1)
                            .build()
                    )
                    .shelter(shelter)
                    .build()
            );
        }
        return pets;
    }
    public static List<Pet> getRandomProtectionExpirationDate(final int n,
                                final Shelter shelter) {
        final List<Pet> pets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pets.add(
                    Pet.builder()
                            .name("멍멍이" + i)
                            .birthDate(LocalDate.now().minusMonths(6))
                            .type(PetType.DOG)
                            .weight(5.0f)
                            .description("멍멍이는 귀여워요" + i)
                            .sex(Sex.MALE)
                            .protectionExpirationDate(LocalDate.of(2023, (int) (Math.random() * 11) + 1, (int) (Math.random() * 30) + 1))
                            .vaccinationStatus("접종완료" + i)
                            .neutralizationStatus(NeutralizationStatus.UNKNOWN)
                            .adoptionStatus(AdoptionStatus.NO)
                            .profileImageUrl("http://amazon.server/api/petImage/20231001104521_test" + i + ".jpg")
                            .profileShortFormUrl("http://amazon.server/api/petVideo/20231001104521_test" + i + ".mp4")
                            .size("작아요 소형견입니다." + i)
                            .petPolygonProfile(
                                    PetPolygonProfile.builder()
                                            .activeness(3)
                                            .intelligence(3)
                                            .affinity(2)
                                            .adaptability(4)
                                            .athletic(1)
                                            .build()
                            )
                            .shelter(shelter)
                            .build()
            );
        }
        return pets;
    }
    public static List<Pet> getNullProtectionExpirationDate(final int n,
                                                              final Shelter shelter) {
        final List<Pet> pets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pets.add(
                    Pet.builder()
                            .name("멍멍이" + i)
                            .birthDate(LocalDate.now().minusMonths(6))
                            .type(PetType.DOG)
                            .weight(5.0f)
                            .description("멍멍이는 귀여워요" + i)
                            .sex(Sex.MALE)
                            .vaccinationStatus("접종완료" + i)
                            .neutralizationStatus(NeutralizationStatus.UNKNOWN)
                            .protectionExpirationDate(null)
                            .adoptionStatus(AdoptionStatus.NO)
                            .profileImageUrl("http://amazon.server/api/petImage/20231001104521_test" + i + ".jpg")
                            .profileShortFormUrl("http://amazon.server/api/petVideo/20231001104521_test" + i + ".mp4")
                            .size("작아요 소형견입니다." + i)
                            .petPolygonProfile(
                                    PetPolygonProfile.builder()
                                            .activeness(3)
                                            .intelligence(3)
                                            .affinity(2)
                                            .adaptability(4)
                                            .athletic(1)
                                            .build()
                            )
                            .shelter(shelter)
                            .build()
            );
        }
        return pets;
    }
}
