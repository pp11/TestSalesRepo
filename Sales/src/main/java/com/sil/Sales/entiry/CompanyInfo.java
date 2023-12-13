package com.sil.Sales.entiry;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "company_info", indexes = {@Index(name = "index_company_id",  columnList="companyId", unique = true)})
public class CompanyInfo {

	@Id
    @SequenceGenerator(
            name = "company_sequence",
            sequenceName = "company_sequence",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "company_sequence"
    )
    @Column(
            name = "companyId",
            updatable = true
    )
	private Long companyId;
	private String companyName;
	private String address;
	private String email;
	private String contactNo;
	private String shortName;
	private String status;
	
}