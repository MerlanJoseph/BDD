package com.pom;

import com.pages.*;

public class PageObjectManager {

	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private ApplicantInformationPage appInfoPage;
	private CreateAccountPage createAccPage;
	private OrganizationsPage orgPage;
	private AccountSummaryPage accSummaryPage;
	private SelectAccountPage selectAccPage;
	private LOBPage lobPage;
	private OfferingsPage offeringsPage;
	private QualificationPage qualificationPage;
	private PolicyInfoPage policyInfoPage;
	private CommercialAutoLinePage CommercialAutoLinePage;
	private LocationsPage LocationsPage;
	private VehicleInformationPage VehicleInformationPage;
	private VccSearchPage VccSearchPage;
	private StateInfoPage StateInfoPage;
	private DriversPage DriversPage;
	private DriverDetailsPage DriverDetailsPage;
	private VehiclesPage VehiclesPage;
	private CACoveragesPage CACoveragesPage;
	private PACoveragesPage coveragesPAPage;
	private ModifiersPage ModifiersPage;
	private RiskAnalysisPage RAPage;
	private PolicyReviewPage policyReviewPage;
	private QuotePage quotePage;
	private SubmissionBoundPage subBoundPage;
	private PolicySummaryPage policySummaryPage;

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public DashboardPage getDashboardPage() {
		return (dashboardPage == null) ? dashboardPage = new DashboardPage() : dashboardPage;
	}

	public ApplicantInformationPage getApplicantInformationPage() {
		return (appInfoPage == null) ? appInfoPage = new ApplicantInformationPage() : appInfoPage;
	}

	public CreateAccountPage getCreateAccountPage() {
		return (createAccPage == null) ? createAccPage = new CreateAccountPage() : createAccPage;
	}

	public OrganizationsPage getOrganizationsPage() {
		return (orgPage == null) ? orgPage = new OrganizationsPage() : orgPage;
	}

	public AccountSummaryPage getAccountSummaryPage() {
		return (accSummaryPage == null) ? accSummaryPage = new AccountSummaryPage() : accSummaryPage;
	}

	public SelectAccountPage getSelectAccountPage() {
		return (selectAccPage == null) ? selectAccPage = new SelectAccountPage() : selectAccPage;
	}

	public LOBPage getLOBPage() {
		return (lobPage == null) ? lobPage = new LOBPage() : lobPage;
	}
	

	public OfferingsPage getOfferingsPage() {
		return (offeringsPage == null) ? offeringsPage = new OfferingsPage() : offeringsPage;
	}

	public QualificationPage getQualificationPage() {
		return (qualificationPage == null) ? qualificationPage = new QualificationPage() : qualificationPage;
	}

	public PolicyInfoPage getPolicyInfoPage() {
		return (policyInfoPage == null) ? policyInfoPage = new PolicyInfoPage() : policyInfoPage;
	}
	
	public CommercialAutoLinePage getCommercialAutoLinePage() {
		return (CommercialAutoLinePage == null) ? CommercialAutoLinePage =new CommercialAutoLinePage() : CommercialAutoLinePage;
	}
	
	public LocationsPage getLocationsPage() {
		return (LocationsPage == null) ? LocationsPage =new LocationsPage() : LocationsPage;
	}
	
	public VehicleInformationPage getVehicleInformationPage() {
		return (VehicleInformationPage == null) ? VehicleInformationPage =new VehicleInformationPage(): VehicleInformationPage;
	}
	public VccSearchPage getVccSearchPage() {
		return (VccSearchPage == null) ? VccSearchPage =new VccSearchPage() : VccSearchPage;
		}
	
	public StateInfoPage getStateInfoPage() {
		return (StateInfoPage == null) ? StateInfoPage =new StateInfoPage() : StateInfoPage;
	}

	public DriversPage getDriversPage() {
		return (DriversPage == null) ? DriversPage = new DriversPage() : DriversPage;
	}

	
	public DriverDetailsPage getDriverDetailsPage() {
		return (DriverDetailsPage == null) ? DriverDetailsPage =new DriverDetailsPage() : DriverDetailsPage;
	}

	

	public VehiclesPage getVehiclesPage() {
		return (VehiclesPage == null) ? VehiclesPage = new VehiclesPage() : VehiclesPage;
	}

	public PACoveragesPage getPACoveragesPage() {
		return (coveragesPAPage == null) ? coveragesPAPage = new PACoveragesPage() : coveragesPAPage;
	}

	public CACoveragesPage getCACoveragesPage() {
		return(CACoveragesPage == null) ? CACoveragesPage =new CACoveragesPage() : CACoveragesPage;
	}
	public ModifiersPage getModifiersPage() {
		return(ModifiersPage == null) ? ModifiersPage =new ModifiersPage() : ModifiersPage;
	}
	public RiskAnalysisPage getRAPage() {
		return (RAPage == null) ? RAPage = new RiskAnalysisPage() : RAPage;
	}

	public PolicyReviewPage getPolicyReviewPage() {
		return (policyReviewPage == null) ? policyReviewPage = new PolicyReviewPage() : policyReviewPage;
	}

	public QuotePage getQuotePage() {
		return (quotePage == null) ? quotePage = new QuotePage() : quotePage;
	}

	public SubmissionBoundPage getSubBoundPage() {
		return (subBoundPage == null) ? subBoundPage = new SubmissionBoundPage() : subBoundPage;
	}

	public PolicySummaryPage getPolicySummaryPage() {
		return (policySummaryPage == null) ? policySummaryPage = new PolicySummaryPage() : policySummaryPage;
	}

}
