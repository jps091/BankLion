package org.accountbook.db.profile;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.accountbook.db.BaseTimeEntity;

import java.time.LocalDate;

@Entity
@Table(name = "profiles")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@SuperBuilder
public class ProfileEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate birthDate;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String image;


}
