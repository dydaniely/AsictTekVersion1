<ACORD xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="F:\MRI\XML\XMLCUS~2\PROGRA~1\ACORDC~2.XSD">
	<SignonRq>
		<SignonPswd>
			<CustId>
				<SPName>iso.com</SPName>
				<CustLoginId>XL1ZX</CustLoginId>
			</CustId>
			<CustPswd>
				<EncryptionTypeCd>NONE</EncryptionTypeCd>
				<Pswd>lmxz1lx1</Pswd>
			</CustPswd>
		</SignonPswd>
		<ClientDt>2017-04-09T10:18:25</ClientDt>
		<CustLangPref>en-US</CustLangPref>
		<ClientApp>
			<Org>ISO</Org>
			<Name>XML_TEST</Name>
			<Version>3.0</Version>
		</ClientApp>
	</SignonRq>
	<ClaimsSvcRq>
		<RqUID>A73AE52EAF6F647E5B0F81E45F93028A2A</RqUID>
		<ClaimInvestigationAddRq>
			<RqUID>A71A52C5FDDF641228D9D37F53FFD325849</RqUID>
			<TransactionRequestDt>2015-03-09T14:18:20</TransactionRequestDt>
			<CurCd>US</CurCd>
			<CodeList id="PolicyTypeCdList">
				<CodeListName>PolicyTypeCd</CodeListName>
				<CodeListOwnerCd>ISOUS</CodeListOwnerCd>
			</CodeList>
			<CodeList id="PaymentTypeCdList">
				<CodeListName>PaymentTypeCd</CodeListName>
				<CodeListOwnerCd>ISOUS</CodeListOwnerCd>
			</CodeList>
			<CodeList id="ClaimsPartyRoleCdList">
				<CodeListName>ClaimsPartyRoleCd</CodeListName>
				<CodeListOwnerCd>ISOUS</CodeListOwnerCd>
			</CodeList>
			<CodeList id="CoverageCdList">
				<CodeListName>CoverageCd</CodeListName>
				<CodeListOwnerCd>ISOUS</CodeListOwnerCd>
			</CodeList>
			<CodeList id="LossTypeCdList">
				<CodeListName>LossTypeCd</CodeListName>
				<CodeListOwnerCd>ISOUS</CodeListOwnerCd>
			</CodeList>
			<CodeList id="RealEstateTypeCdList">
				<CodeListName>RealEstateTypeCd</CodeListName>
				<CodeListOwnerCd>ISOUS</CodeListOwnerCd>
			</CodeList>
			<Policy>
				<PolicyNumber>PN03142006E</PolicyNumber>
				<LOBCd codelistref="PolicyTypeCdList">PPHO</LOBCd>
				<MiscParty id="InsurerID">
					<ItemIdInfo>
						<AgencyId>L16810000</AgencyId>
					</ItemIdInfo>
					<MiscPartyInfo>
						<MiscPartyRoleCd>CarrierInsurer</MiscPartyRoleCd>
					</MiscPartyInfo>
				</MiscParty>
			</Policy>
			<ClaimsOccurrence id="Claim03142006E">
				<ItemIdInfo>
					<InsurerId>022017001674</InsurerId>
				</ItemIdInfo>
				<LossDt>2015-03-03</LossDt>
				<IncidentDesc>ELECTRICAL FIRE IN BEDROOM</IncidentDesc>
				<Addr>
					<StateProvCd>AK</StateProvCd>
				</Addr>
				<ProbableIncurredAmt idref="PropertyLoss-01">
					<Amt>00000006000</Amt>
				</ProbableIncurredAmt>
			</ClaimsOccurrence>
			<ClaimsParty id="ClaimsParty-01">
				<GeneralPartyInfo>
					<NameInfo>
						<PersonName>
							<Surname>TERANNA</Surname>
							<GivenName>CONNOR</GivenName>
						</PersonName>
					</NameInfo>
					<Addr>
						<Addr1>986 BUCHANNAN DR</Addr1>
						<City>FAIRBANKS</City>
						<StateProvCd>AK</StateProvCd>
						<PostalCode>99701</PostalCode>
					</Addr>
				</GeneralPartyInfo>
				<ClaimsPartyInfo>
					<ClaimsPartyRoleCd codelistref="ClaimsPartyRoleCdList">IN</ClaimsPartyRoleCd>
				</ClaimsPartyInfo>
			</ClaimsParty>
			<AdjusterParty>
				<AdjusterPartyInfo AssignmentRef="PropertyLoss-01">
					<LossCauseCd codelistref="LossTypeCdList">FIRE</LossCauseCd>
				</AdjusterPartyInfo>
			</AdjusterParty>
			<PropertyLossInfo id="PropertyLoss-01" ClaimsPartyRefs="ClaimsParty-01">
				<ClaimsSubjectInsuranceInfo>
					<SubjectInsuranceCd>BLDG</SubjectInsuranceCd>
					<InsuranceAmt>
						<Amt>1000</Amt>
					</InsuranceAmt>
					<ProbableIncurredAmt>
						<Amt>2000</Amt>
					</ProbableIncurredAmt>
					<ClaimsPayment>
						<PaymentTypeCd>LossResv</PaymentTypeCd>
						<ClaimsPaymentCovInfo>
							<CoverageCd codelistref="CoverageCdList">BLDG</CoverageCd>
							<PaymentAmt>
								<Amt>3000</Amt>
							</PaymentAmt>
						</ClaimsPaymentCovInfo>
					</ClaimsPayment>
					<ClaimsPayment>
						<PaymentTypeCd>Payment</PaymentTypeCd>
						<ClaimsPaymentCovInfo>
							<CoverageCd codelistref="CoverageCdList">BLDG</CoverageCd>
							<PaymentAmt>
								<Amt>4000</Amt>
							</PaymentAmt>
						</ClaimsPaymentCovInfo>
					</ClaimsPayment>
				</ClaimsSubjectInsuranceInfo>
				<ClaimsSubjectInsuranceInfo>
					<SubjectInsuranceCd>C</SubjectInsuranceCd>
					<InsuranceAmt>
						<Amt>5000</Amt>
					</InsuranceAmt>
					<ProbableIncurredAmt>
						<Amt>6000</Amt>
					</ProbableIncurredAmt>
					<ClaimsPayment>
						<PaymentTypeCd>LossResv</PaymentTypeCd>
						<ClaimsPaymentCovInfo>
							<CoverageCd codelistref="CoverageCdList">C</CoverageCd>
							<PaymentAmt>
								<Amt>7000</Amt>
							</PaymentAmt>
						</ClaimsPaymentCovInfo>
					</ClaimsPayment>
					<ClaimsPayment>
						<PaymentTypeCd>Payment</PaymentTypeCd>
						<ClaimsPaymentCovInfo>
							<CoverageCd codelistref="CoverageCdList">C</CoverageCd>
							<PaymentAmt>
								<Amt>8000</Amt>
							</PaymentAmt>
						</ClaimsPaymentCovInfo>
					</ClaimsPayment>
				</ClaimsSubjectInsuranceInfo>
				<ClaimsSubjectInsuranceInfo>
					<SubjectInsuranceCd>STOCK</SubjectInsuranceCd>
					<InsuranceAmt>
						<Amt>9000</Amt>
					</InsuranceAmt>
					<ProbableIncurredAmt>
						<Amt>10000</Amt>
					</ProbableIncurredAmt>
					<ClaimsPayment>
						<PaymentTypeCd>LossResv</PaymentTypeCd>
						<ClaimsPaymentCovInfo>
							<CoverageCd codelistref="CoverageCdList">STOCK</CoverageCd>
							<PaymentAmt>
								<Amt>11000</Amt>
							</PaymentAmt>
						</ClaimsPaymentCovInfo>
					</ClaimsPayment>
					<ClaimsPayment>
						<PaymentTypeCd>Payment</PaymentTypeCd>
						<ClaimsPaymentCovInfo>
							<CoverageCd codelistref="CoverageCdList">STOCK</CoverageCd>
							<PaymentAmt>
								<Amt>12000</Amt>
							</PaymentAmt>
						</ClaimsPaymentCovInfo>
					</ClaimsPayment>
				</ClaimsSubjectInsuranceInfo>
				<ClaimsSubjectInsuranceInfo>
					<SubjectInsuranceCd>UseOccupancy</SubjectInsuranceCd>
					<InsuranceAmt>
						<Amt>13000</Amt>
					</InsuranceAmt>
					<ProbableIncurredAmt>
						<Amt>14000</Amt>
					</ProbableIncurredAmt>
					<ClaimsPayment>
						<PaymentTypeCd>LossResv</PaymentTypeCd>
						<ClaimsPaymentCovInfo>
							<CoverageCd codelistref="CoverageCdList">UseOccupancy</CoverageCd>
							<PaymentAmt>
								<Amt>15000</Amt>
							</PaymentAmt>
						</ClaimsPaymentCovInfo>
					</ClaimsPayment>
					<ClaimsPayment>
						<PaymentTypeCd>Payment</PaymentTypeCd>
						<ClaimsPaymentCovInfo>
							<CoverageCd codelistref="CoverageCdList">UseOccupancy</CoverageCd>
							<PaymentAmt>
								<Amt>16000</Amt>
							</PaymentAmt>
						</ClaimsPaymentCovInfo>
					</ClaimsPayment>
				</ClaimsSubjectInsuranceInfo>
				<ClaimsSubjectInsuranceInfo>
					<SubjectInsuranceCd>OT</SubjectInsuranceCd>
					<InsuranceAmt>
						<Amt>17000</Amt>
					</InsuranceAmt>
					<ProbableIncurredAmt>
						<Amt>18000</Amt>
					</ProbableIncurredAmt>
					<ClaimsPayment>
						<PaymentTypeCd>LossResv</PaymentTypeCd>
						<ClaimsPaymentCovInfo>
							<CoverageCd codelistref="CoverageCdList">OT</CoverageCd>
							<PaymentAmt>
								<Amt>19000</Amt>
							</PaymentAmt>
						</ClaimsPaymentCovInfo>
					</ClaimsPayment>
					<ClaimsPayment>
						<PaymentTypeCd>Payment</PaymentTypeCd>
						<ClaimsPaymentCovInfo>
							<CoverageCd codelistref="CoverageCdList">OT</CoverageCd>
							<PaymentAmt>
								<Amt>20000</Amt>
							</PaymentAmt>
						</ClaimsPaymentCovInfo>
					</ClaimsPayment>
				</ClaimsSubjectInsuranceInfo>
				<RealEstateTypeCd codelistref="RealEstateTypeCdList">D</RealEstateTypeCd>
				<IncendiaryFireInd>N</IncendiaryFireInd>
			</PropertyLossInfo>
		</ClaimInvestigationAddRq>
	</ClaimsSvcRq>
</ACORD>
