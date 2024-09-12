package com.fooddelivery.customerservice.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import lombok.*
import org.jetbrains.annotations.NotNull

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "customers")
data class Customers(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    var id: Long? = null,

    @field:NotBlank(message = "Customer Name cannot be blank")
    @Column(name = "username")
    var username: String? = null,

    @field:NotBlank(message = "Customer Name cannot be blank")
    @Column(name = "email")
    var email: String? = null,

    @field:NotBlank(message = "Customer Name cannot be blank")
    @Column(name = "firstname")
    var firstname: String? = null,

    @field:NotBlank(message = "Customer Name cannot be blank")
    @Column(name = "lastname")
    var lastname: String? = null,

    @field:NotBlank(message = "Customer Name cannot be blank")
    @Column(name = "address")
    var address: String? = null,

    @field:NotBlank(message = "Customer Name cannot be blank")
    @Column(name = "phone")
    var phone: String? = null,
)


